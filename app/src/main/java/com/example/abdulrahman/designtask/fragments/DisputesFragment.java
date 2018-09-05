package com.example.abdulrahman.designtask.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abdulrahman.designtask.R;
import com.example.abdulrahman.designtask.adapters.SubViewPagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class DisputesFragment extends Fragment {
    @BindView(R.id.tab_disputes)
    TabLayout  tabLayout;
    @BindView(R.id.sub_pager_disputes)
    ViewPager pager;
    private Unbinder unbinder;
    private SubViewPagerAdapter adapter;
    private FragmentManager manager;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
          View view=inflater.inflate(R.layout.fragment_disputes,container,false);
          unbinder= ButterKnife.bind(this,view);
          return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        manager=getFragmentManager();
        adapter=new SubViewPagerAdapter(manager);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.canceled));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.accepted));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.waiting));
        tabLayout.setTabGravity(TabLayout.TEXT_ALIGNMENT_GRAVITY);
        pager.setAdapter(adapter);
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
