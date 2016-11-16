package study.com.ted.fingo_ted.Activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import study.com.ted.fingo_ted.Fragments.SignFragments.SignMainFragment;
import study.com.ted.fingo_ted.R;

public class SignActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

        replaceFragment(new SignMainFragment());

    }

    // pager 를 쓰지않고 단순히 Fragment 를 하나의 Layout container 에서 변경 해주기 위한 method
    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.activity_sign, fragment);
        transaction.commit();
    }

}
