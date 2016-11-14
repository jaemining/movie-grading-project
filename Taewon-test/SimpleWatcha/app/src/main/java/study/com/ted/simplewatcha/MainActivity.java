package study.com.ted.simplewatcha;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ViewPager pager_main;

    TabLayout tabLayout;

    Fragment home;
    Fragment search;
    Fragment recommend;
    Fragment myInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home = new Home();
        search = new Search();
        recommend = new Recommend();
        myInfo = new MyInfo();

        tabLayout = (TabLayout)findViewById(R.id.tabLayout_main);
        pager_main = (ViewPager) findViewById(R.id.pager_main);
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        pager_main.setAdapter(adapter);

        // 페이저가 변경되었을때 탭을 변경해주는 리스너
        pager_main.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        // 탭에 페이저를 연결해주는 리스너
        tabLayout.setOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(pager_main));
    }

    class PagerAdapter extends FragmentStatePagerAdapter {

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = new Fragment();

            switch(position){
                case 0:
                    fragment = home;
                    break;
                case 1:
                    fragment = search;
                    break;
                case 2:
                    fragment = recommend;
                    break;
                case 3:
                    fragment = myInfo;
                    break;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 4;
        }
    }
}
