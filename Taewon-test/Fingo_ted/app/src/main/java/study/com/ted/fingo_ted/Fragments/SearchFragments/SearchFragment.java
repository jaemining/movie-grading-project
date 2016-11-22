package study.com.ted.fingo_ted.Fragments.SearchFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import study.com.ted.fingo_ted.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {

    EditText etSearch;
    Button btnRanking;

    public SearchFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        etSearch = (EditText) view.findViewById(R.id.etSearch);
        etSearch.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Fragment searchDetailFragment = new SearchDetailFragment();

                FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.searchContainer, searchDetailFragment);
                transaction.commit();
            }
        });

        btnRanking = (Button) view.findViewById(R.id.btnRanking);
        btnRanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 박스오피스 랭킹을 보여주는 Fragment 불러오기
                Fragment boxOfficeFragment = new BoxOfficeFragment();

                FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.MainContainer, boxOfficeFragment);
                transaction.commit();
            }
        });

        return view;
    }


}
