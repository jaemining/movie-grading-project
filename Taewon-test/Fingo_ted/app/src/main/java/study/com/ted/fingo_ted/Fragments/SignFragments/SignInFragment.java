package study.com.ted.fingo_ted.Fragments.SignFragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import study.com.ted.fingo_ted.Activities.MainActivity;
import study.com.ted.fingo_ted.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignInFragment extends Fragment implements View.OnClickListener {

    Button btnLogIn;
    Button btnLogInFacebook;

    EditText etEmail;
    EditText etPW;

    public SignInFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sign_in, container, false);

        btnLogIn = (Button) view.findViewById(R.id.btnLogIn);
        btnLogIn.setOnClickListener(this);

        btnLogInFacebook = (Button) view.findViewById(R.id.btnLogInFacebook);
        btnLogInFacebook.setOnClickListener(this);


        return view;

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.btnLogIn:
            case R.id.btnLogInFacebook:

                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);

                break;
        }

    }
}
