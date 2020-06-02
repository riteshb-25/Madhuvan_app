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
import com.example.madhuvan_app.adapter.ini_PagerAdapter;

public class ini_Fragment extends Fragment {
    private ViewPager viewPager2;
    private ini_PagerAdapter adapter2;

    public ini_Fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ini_fragment, container, false);

        viewPager2 = view.findViewById(R.id.viewpager2);
        adapter2 =  new ini_PagerAdapter(getFragmentManager());
        viewPager2.setAdapter(adapter2);


        return view;
    }
}
