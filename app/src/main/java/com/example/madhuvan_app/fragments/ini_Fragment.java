package com.example.madhuvan_app.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.madhuvan_app.R;
import com.example.madhuvan_app.adapter.TabAdapter;
import com.example.madhuvan_app.adapter.ini_PagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class ini_Fragment extends Fragment {
    private ViewPager viewPager2;
    private TabAdapter adapter2;
    private TabLayout tableLayout;

    public ini_Fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ini_fragment, container, false);

        viewPager2 = view.findViewById(R.id.viewpager2);
        tableLayout = view.findViewById(R.id.tablayout2);

        adapter2 = new TabAdapter(getFragmentManager());
        adapter2.addFragment(new ini_First(), "First");
        adapter2.addFragment(new ini_Second(), "Second");
        adapter2.addFragment(new ini_Third(), "Third");
        adapter2.addFragment(new ini_Fourth(), "Fourth");
        adapter2.addFragment(new ini_Fifth(), "Fifth");

        viewPager2.setAdapter(adapter2);
        tableLayout.setupWithViewPager(viewPager2);


        return view;
    }
}
