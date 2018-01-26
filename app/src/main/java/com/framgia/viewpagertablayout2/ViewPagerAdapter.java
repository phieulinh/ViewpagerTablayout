package com.framgia.viewpagertablayout2;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tieu Long Ha on 26/01/2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
           public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            if (position == 0)
            {
                fragment = new Fragment1();
            }
            else if (position == 1)
            {
                fragment = new Fragmen2();
            }
            else if (position == 2)
            {
                fragment = new Fragment3();
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            String title = null;
            if (position == 0)
            {
                title = "Tab-1";
            }
            else if (position == 1)
            {
                title = "Tab-2";
            }
            else if (position == 2)
            {
                title = "Tab-3";
            }
            return title;
        }
}

