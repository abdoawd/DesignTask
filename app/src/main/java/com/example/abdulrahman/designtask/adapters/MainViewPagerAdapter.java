package com.example.abdulrahman.designtask.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.abdulrahman.designtask.fragments.DisputesFragment;
import com.example.abdulrahman.designtask.fragments.OthersFragment;

public class MainViewPagerAdapter extends FragmentStatePagerAdapter {
    public MainViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }



    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                return new OthersFragment();
            case 1 :
                return new DisputesFragment();
                default:
                    return null;
        }

    }

    @Override
    public int getCount() {
        return 2;
    }
}
