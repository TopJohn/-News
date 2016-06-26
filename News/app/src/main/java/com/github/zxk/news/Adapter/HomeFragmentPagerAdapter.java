package com.github.zxk.news.Adapter;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;

import com.github.zxk.news.UI.fragment.base.BaseLazyFragment;

import java.util.List;

/**
 * Created by 庄欣锴zz on 2016/6/18.
 */
public class HomeFragmentPagerAdapter extends FragmentPagerAdapter {
    private List< BaseLazyFragment > mListFragments = null;
    AppCompatActivity mActivity;

    public HomeFragmentPagerAdapter ( FragmentManager fm, List fragments , AppCompatActivity activity) {
        super ( fm );
        mListFragments = fragments;
        mActivity=activity;
    }

    @Override
    public int getCount ( ) {
        if ( mListFragments != null ) {
            return mListFragments.size ( );
        } else {
            return 0;
        }
    }

    @Override
    public BaseLazyFragment getItem ( int position ) {
        if ( mListFragments != null && position >= 0 && position < mListFragments.size ( ) ) {
            return mListFragments.get ( position );
        } else {
            return null;
        }
    }

}

