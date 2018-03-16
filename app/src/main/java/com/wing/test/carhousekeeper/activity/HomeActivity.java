package com.wing.test.carhousekeeper.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.wing.test.carhousekeeper.R;
import com.wing.test.carhousekeeper.fragment.index.IndexFragment;
import com.wing.test.carhousekeeper.fragment.light.LightFragment;
import com.wing.test.carhousekeeper.fragment.pressure.PressureFragment;
import com.wing.test.carhousekeeper.fragment.property.PropertyFragment;
import com.wing.test.carhousekeeper.fragment.self.SelfFragment;
import com.wing.test.carhousekeeper.view.MyViewPager;


import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity  extends BaseActivity {

    @BindView(R.id.layoutHome)
    LinearLayout layoutHome;
    @BindView(R.id.layoutCheDeng)
    LinearLayout layoutCheDeng;
    @BindView(R.id.layoutTirepressure)
    RelativeLayout layoutTirepressure;
    @BindView(R.id.layoutPerformance)
    LinearLayout layoutPerformance;
    @BindView(R.id.layoutSelf)
    LinearLayout layoutSelf;
    @BindView(R.id.vp)
    MyViewPager vp;

    private static final String TAG = HomeActivity.class.getName();
    private HomeFragmentAdapter mAdapter;
    private SparseArray<Fragment> mFragments = new SparseArray<Fragment>();
    List<ViewGroup> list_layout = new ArrayList<ViewGroup>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        initActionBar();
        initTitle();
        initFragments();
        initLayouts();

    }

    private void initTitle(){
        pActionBar.setActionBarLeftVisible();
        pActionBar.getActionBarLeft().setImageResource((R.drawable.home_page_left));
        pActionBar.setActionBarRightVisible();
        pActionBar.getActionBarRight().setImageResource(R.drawable.home_page_right);
    }

    private void  initFragments(){
        mFragments.put(0, IndexFragment.getInstance());
        mFragments.put(1, LightFragment.getInstance());
        mFragments.put(2, PressureFragment.getInstance());
        mFragments.put(3, PropertyFragment.getInstance());
        mFragments.put(4, SelfFragment.getInstance());
        mAdapter = new HomeFragmentAdapter(getSupportFragmentManager());
        vp.setAdapter(mAdapter);
    }

    private void initLayouts(){
        list_layout.add(layoutHome);
        list_layout.add(layoutCheDeng);
        list_layout.add(layoutTirepressure);
        list_layout.add(layoutPerformance);
        list_layout.add(layoutSelf);
        changeTab(0,"首页");
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


    @OnClick({R.id.layoutHome, R.id.layoutCheDeng, R.id.layoutTirepressure, R.id.layoutPerformance,R.id.layoutSelf})
    public void onViewClicked(final View view) {
        switch (view.getId()) {
            case R.id.layoutHome:
                changeTab(0,"首页");
                vp.setCurrentItem(0,false);
                break;
            case R.id.layoutCheDeng:
                changeTab(1,"车灯");
                vp.setCurrentItem(1,false);
                break;
            case R.id.layoutTirepressure:
                changeTab(2,"胎压");
                vp.setCurrentItem(2,false);
                break;
            case R.id.layoutPerformance:
                changeTab(3,"性能");
                vp.setCurrentItem(3,false);
                break;
            case R.id.layoutSelf:
                changeTab(4,"我的");
                vp.setCurrentItem(4,false);
                break;
        }
    }
    private void changeTab(int pos,String title) {
        for (int i = 0; i < list_layout.size(); i++) {
            if (pos == i)
                list_layout.get(pos).setSelected(true);
            else
                list_layout.get(i).setSelected(false);
        }
        pActionBar.setActionBarTitleText(title);
    }

}
