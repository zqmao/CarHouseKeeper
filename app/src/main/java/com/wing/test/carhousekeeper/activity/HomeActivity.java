package com.wing.test.carhousekeeper.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.SparseArray;

import com.wing.test.carhousekeeper.R;
import com.wing.test.carhousekeeper.fragment.index.IndexFragment;
import com.wing.test.carhousekeeper.fragment.light.LightFragment;
import com.wing.test.carhousekeeper.fragment.pressure.PressureFragment;
import com.wing.test.carhousekeeper.fragment.property.PropertyFragment;
import com.wing.test.carhousekeeper.fragment.self.SelfFragment;
import com.wing.test.carhousekeeper.util.Finder;

public class HomeActivity  extends BaseActivity {
    private static final String TAG = HomeActivity.class.getName();
    private ViewPager mViewPager;
    private HomeFragmentAdapter mAdapter;
    private SparseArray<Fragment> mFragments = new SparseArray<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initActionBar();
        pActionBar.setActionBarLeftVisible();
        pActionBar.getActionBarLeft().setImageResource((R.drawable.home_page_left));
        pActionBar.setActionBarRightVisible();
        pActionBar.getActionBarRight().setImageResource(R.drawable.home_page_right);
        pActionBar.setActionBarTitleText("首页");

        mFragments.put(0, IndexFragment.getInstance());
        mFragments.put(1, LightFragment.getInstance());
        mFragments.put(2, PressureFragment.getInstance());
        mFragments.put(3, PropertyFragment.getInstance());
        mFragments.put(4, SelfFragment.getInstance());
        mViewPager = Finder.find(this, R.id.vp);
        mAdapter = new HomeFragmentAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);
    }

    private class HomeFragmentAdapter extends FragmentStatePagerAdapter {

        public HomeFragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return "";
        }

        @Override
        public int getItemPosition(Object object) {
            int index = mFragments.indexOfValue((Fragment) object);
            if (index != -1) {
                return index;
            }
            return PagerAdapter.POSITION_NONE;
        }

    }

}
