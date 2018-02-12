package com.example.maude.tablayout;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ViewPager vp;
    TabLayout tb;
    PagerAdapter pagerAdap;
    public final int nb = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = findViewById(R.id.viewp);
        tb = findViewById(R.id.tablay);

        pagerAdap = new PagerAdapter(getSupportFragmentManager());
        vp.setAdapter(pagerAdap);

        tb.setupWithViewPager(vp);
    }

    public class PagerAdapter extends FragmentPagerAdapter{
        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return "Tab " + position;
        }

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            SimpleFragment fragment = new SimpleFragment();
            Bundle args = new Bundle();
            args.putInt("ID",position);
            fragment.setArguments(args);
            //Toast.makeText(MainActivity.this,"Fragment : " + position, Toast.LENGTH_SHORT).show();
            return fragment;
        }

        @Override
        public int getCount() {
            return nb;
        }
    }
}
