package study.com.ted.fingo_ted.Activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import study.com.ted.fingo_ted.Fragments.FavoriteFragments.FavoriteFragment;
import study.com.ted.fingo_ted.Fragments.HomeFragments.HomeFragment;
import study.com.ted.fingo_ted.Fragments.ProfileFragments.ProfileFragment;
import study.com.ted.fingo_ted.Fragments.SearchFragments.SearchFragment;
import study.com.ted.fingo_ted.R;


public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    RelativeLayout container;

    public static String movie_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        container = (RelativeLayout) findViewById(R.id.MainContainer);

        replaceFragment(new HomeFragment());
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch(tab.getPosition()){
                    case 0:
                        replaceFragment(new HomeFragment());
                        break;
                    case 1:
                        replaceFragment(new SearchFragment());
                        break;
                    case 2:
                        replaceFragment(new FavoriteFragment());
                        break;
                    case 3:
                        replaceFragment(new ProfileFragment());
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.MainContainer, fragment);
        transaction.commit();
    }

}
