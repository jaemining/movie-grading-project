package com.jaemin.android.jaemin_test;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    static final int FRAGMENT_COUNT = 4;

    Toolbar mToolbar;

    HomeFragment mHomeFragment;
    ExploreFragment mExploreFragment;
    RecommendFragment mRecommendFragment;
    MyPageFragment mMyPageFragment;

    TabLayout mTabLayout;
    ViewPager mViewPager;
    PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mToolbar);

        mHomeFragment = new HomeFragment();
        mExploreFragment = new ExploreFragment();
        mRecommendFragment = new RecommendFragment();
        mMyPageFragment = new MyPageFragment();

        mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.ic_home_black_24dp));
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.ic_search_black_24dp));
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.ic_favorite_border_black_24dp));
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.ic_face_black_24dp));

        mViewPager = (ViewPager) findViewById(R.id.viewPager);

        mPagerAdapter = new PagerAdapter(getSupportFragmentManager());

        mViewPager.setAdapter(mPagerAdapter);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));

        mTabLayout.setOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));


        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    class PagerAdapter extends FragmentStatePagerAdapter {

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            Fragment fragment = null;

            switch (position) {
                case 0:
                    fragment = mHomeFragment;
                    break;
                case 1:
                    fragment = mExploreFragment;
                    break;
                case 2:
                    fragment = mRecommendFragment;
                    break;
                case 3:
                    fragment = mMyPageFragment;
                    break;
            }

            return fragment;
        }

        @Override
        public int getCount() {
            return FRAGMENT_COUNT;
        }
    }
}
