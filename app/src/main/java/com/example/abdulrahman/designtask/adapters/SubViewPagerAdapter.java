package com.example.abdulrahman.designtask.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.abdulrahman.designtask.fragments.AcceptedFragment;
import com.example.abdulrahman.designtask.fragments.CanceledFragment;
import com.example.abdulrahman.designtask.fragments.WaitingFragment;

public class SubViewPagerAdapter extends FragmentStatePagerAdapter {
    public SubViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CanceledFragment();
            case 1:
                return new AcceptedFragment();

            case 2:
                return new WaitingFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
