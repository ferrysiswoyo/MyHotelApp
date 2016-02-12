package com.ferry.myhotelapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ferry.myhotelapp.DetailHotelActivity;
import com.ferry.myhotelapp.fragment.ImageSlideshowFragment;

/**
 * Created by Student6 on 11/02/2016.
 */
public class SlideshowFragmentAdapter extends FragmentPagerAdapter {

    public SlideshowFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return ImageSlideshowFragment.newInstance(DetailHotelActivity.imageUrls[position]);
    }

    @Override
    public int getCount() {
        return DetailHotelActivity.imageUrls.length;
    }
}
