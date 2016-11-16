package study.com.ted.fingo_ted.Fragments.SignFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import study.com.ted.fingo_ted.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignMainFragment extends Fragment implements View.OnClickListener{

    Button btnSignIn;
    Button btnSignFB;
    Button btnSignEmail;

    public SignMainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sign_main, container, false);

        btnSignIn = (Button) view.findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(this);

        btnSignEmail = (Button) view.findViewById(R.id.btnSignEmail);
        btnSignEmail.setOnClickListener(this);

        btnSignFB = (Button) view.findViewById(R.id.btnSignFB);
        btnSignFB.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.btnSignIn:

                Fragment signInFragment = new SignInFragment();
                replaceFragment(signInFragment);

                break;

            case R.id.btnSignEmail:

                Fragment signUpEmailFragment = new SignUpEmailFragment();
                replaceFragment(signUpEmailFragment);

                break;

            case R.id.btnSignFB:

                Fragment signUpFacebookFragment = new SignUpFacebookFragment();
                replaceFragment(signUpFacebookFragment);

                break;

        }

    }

    private void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager = getFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.activity_sign, fragment);
        transaction.commit();

    }


}
