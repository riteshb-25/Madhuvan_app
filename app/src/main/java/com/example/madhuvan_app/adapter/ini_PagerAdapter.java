package com.example.madhuvan_app.adapter;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.madhuvan_app.fragments.ini_Fifth;
import com.example.madhuvan_app.fragments.ini_First;
import com.example.madhuvan_app.fragments.ini_Fourth;
import com.example.madhuvan_app.fragments.ini_Second;
import com.example.madhuvan_app.fragments.ini_Third;

public class ini_PagerAdapter extends FragmentPagerAdapter {

    public ini_PagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull

    @Override

    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ini_First();
            case 1:
                return new ini_Second();
            case 2 :
                return new ini_Third();
            case 3 :
                return new ini_Fourth();
            case 4 :
                return new ini_Fifth();
            default: return null;
        }
    }
    @Override
    public int getCount() {
        return 5;
    }

}