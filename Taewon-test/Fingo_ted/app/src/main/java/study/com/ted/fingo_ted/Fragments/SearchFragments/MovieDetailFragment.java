package study.com.ted.fingo_ted.Fragments.SearchFragments;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import study.com.ted.fingo_ted.Activities.MainActivity;
import study.com.ted.fingo_ted.Interfaces.FingoAPI;
import study.com.ted.fingo_ted.Models.MovieDetail;
import study.com.ted.fingo_ted.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MovieDetailFragment extends Fragment {

    private static String KEY = "71cd9a6592ef09f2d81b2711b39e044b";
    private static String DATE = "20161101";
    private static String KOBIS_BASE_URL = "http://www.kobis.or.kr/kobisopenapi/";
    private static String NAVER_BASE_URL = "https://openapi.naver.com/";
    private static String FINGO_BASE_URL = "http://fingo-test.ijvmwrmuhi.ap-northeast-2.elasticbeanstalk.com/";

    ImageView stillcut;
    TextView tvStory;
    GridView gvGallayList;
    ImageView imgDirector;
    ImageView imgActor1;
    ImageView imgActor2;
    TextView tvDirector;
    TextView tvActor1;
    TextView tvActor2;

    public MovieDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_movie_detail, container, false);

        stillcut = (ImageView) view.findViewById(R.id.imgStillcut);
        tvStory = (TextView) view.findViewById(R.id.tvStory);
        gvGallayList = (GridView) view.findViewById(R.id.gvGallayList);
        imgDirector = (ImageView) view.findViewById(R.id.imgDirector);
        imgActor1 = (ImageView) view.findViewById(R.id.imgActor1);
        imgActor2 = (ImageView) view.findViewById(R.id.imgActor2);
        tvDirector = (TextView) view.findViewById(R.id.tvDirector);
        tvActor1 = (TextView) view.findViewById(R.id.tvActor1);
        tvActor2 = (TextView) view.findViewById(R.id.tvActor2);

        /*************************************************************************************/
        /********************************* FINGO API 호출 ************************************/

        Retrofit client = new Retrofit.Builder()
                .baseUrl(FINGO_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        FingoAPI fingoService = client.create(FingoAPI.class);
        Call<MovieDetail> movieDetailCall = fingoService.getMovieDetail(MainActivity.movie_code);
        movieDetailCall.enqueue(new Callback<MovieDetail>() {
            @Override
            public void onResponse(Call<MovieDetail> call, Response<MovieDetail> response) {

                if(response.isSuccessful()){

                    final MovieDetail data = response.body();

                    Handler handler = new Handler();
                    handler.post(new Runnable() {
                        @Override
                        public void run() {

                            MovieDetail.Stillcut_set[] temp = data.getStillcut_set();
                            String temp_img = temp[0].getStiicut_img();
                            Toast.makeText(getContext(),temp_img, Toast.LENGTH_SHORT).show();

                            /* Images */
                            Glide.with(getContext()).load(data.getMovie_img()).into(stillcut);
                            // gvGallayList

//                            Glide.with(getContext()).load(data.getDirector()).into(imgDirector);
//                            Glide.with(getContext()).load(data.getMovie_img()).into(imgActor1);
//                            Glide.with(getContext()).load(data.getMovie_img()).into(imgActor2);

                            /* Texts */
                            tvStory.setText(data.getStory());

                            MovieDetail.Director[] directors = data.getDirector();
                            tvDirector.setText(directors[0].getName());

                            MovieDetail.Actor[] actors = data.getActor();
                            for(int i=0; i<actors.length; i++){
                                tvActor1.setText(actors[0].getName());
                                tvActor2.setText(actors[1].getName());
                            }

                        }
                    });
                }
            }

            @Override
            public void onFailure(Call<MovieDetail> call, Throwable t) {

            }
        });

        /*************************************************************************************/
        /*************************************************************************************/


        return view;
    }

}
