package study.com.ted.fingo_ted.Fragments.SearchFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import study.com.ted.fingo_ted.Activities.MainActivity;
import study.com.ted.fingo_ted.Interfaces.FingoAPI;
import study.com.ted.fingo_ted.Models.BoxOfficeResult;
import study.com.ted.fingo_ted.R;

/**
 * BASE_URL         : fingo-test.ijvmwrmuhi.ap-northeast-2.elasticbeanstalk.com
 * BOX_OFFICE_LIST  : /api/movie/boxoffice_list/
 * MOVIE_DETAIL     : /api/movie/moviedetail/[영화 ID]/
 **/

public class BoxOfficeFragment extends Fragment {

    private static String KEY = "71cd9a6592ef09f2d81b2711b39e044b";
    private static String DATE = "20161101";
    private static String KOBIS_BASE_URL = "http://www.kobis.or.kr/kobisopenapi/";
    private static String NAVER_BASE_URL = "https://openapi.naver.com/";
    private static String FINGO_BASE_URL = "http://fingo-test.ijvmwrmuhi.ap-northeast-2.elasticbeanstalk.com/";

    ArrayList<BoxOfficeResult.Data> movie_boxOffice = new ArrayList<>();

    ListAdapter adapter;
    ListView boxOfficeList;

    public BoxOfficeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_box_office, container, false);
        boxOfficeList = (ListView) view.findViewById(R.id.boxOfficeList);

        adapter = new ListAdapter();
        boxOfficeList.setAdapter(adapter);

        /*************************************************************************************/
        /********************************* FINGO API 호출 ************************************/

        Retrofit client = new Retrofit.Builder()
                .baseUrl(FINGO_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        FingoAPI fingoService = client.create(FingoAPI.class);
        Call<BoxOfficeResult> boxOfficeResultCall = fingoService.getBoxOfficeList();

        boxOfficeResultCall.enqueue(new Callback<BoxOfficeResult>() {

            @Override
            public void onResponse(Call<BoxOfficeResult> call, Response<BoxOfficeResult> response) {

                if (response.isSuccessful()) {

                    BoxOfficeResult dataList = response.body();
                    for (BoxOfficeResult.Data data : dataList.getData()) {
                        movie_boxOffice.add(data);
                    }
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<BoxOfficeResult> call, Throwable t) {

            }

        });

        /*************************************************************************************/
        /*************************************************************************************/

        boxOfficeList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                MainActivity.movie_code = movie_boxOffice.get(position).getCode();
                Fragment movieDetailFragment = new MovieDetailFragment();

                FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.MainContainer, movieDetailFragment);
                transaction.commit();
            }
        });

        return view;
    }


    class ListAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return movie_boxOffice.size();
        }

        @Override
        public Object getItem(int position) {
            return movie_boxOffice.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            // @TODO 뷰홀더 만들기

            convertView = View.inflate(getActivity(), R.layout.box_office_list_item, null);

            TextView title = (TextView) convertView.findViewById(R.id.tvTitle);
            title.setText(movie_boxOffice.get(position).getTitle());

            TextView score = (TextView) convertView.findViewById(R.id.tvRating);
            score.setText(movie_boxOffice.get(position).getScore());

            TextView runDate = (TextView) convertView.findViewById(R.id.tvRunDate);
            runDate.setText(movie_boxOffice.get(position).getFirst_run_date());

            TextView genre = (TextView) convertView.findViewById(R.id.tvGenre);
            genre.setText(movie_boxOffice.get(position).getGenre());

            TextView audience = (TextView) convertView.findViewById(R.id.tvAudience);
            audience.setText(movie_boxOffice.get(position).getViewer());

            ImageView moviePoster = (ImageView) convertView.findViewById(R.id.moviePoster);
            Glide.with(getContext()).load(movie_boxOffice.get(position).getMovie_img()).into(moviePoster);


            return convertView;
        }
    }
}
