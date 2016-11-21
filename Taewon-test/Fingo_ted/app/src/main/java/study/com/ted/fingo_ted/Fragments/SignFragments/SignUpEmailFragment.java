package study.com.ted.fingo_ted.Fragments.SignFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import study.com.ted.fingo_ted.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpEmailFragment extends Fragment {


    public SignUpEmailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up_email, container, false);
    }

}
