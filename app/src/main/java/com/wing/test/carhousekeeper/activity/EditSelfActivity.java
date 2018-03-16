package com.wing.test.carhousekeeper.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
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

public class EditSelfActivity extends BaseActivity {

//    @BindView(R.id.layoutHome)
//    LinearLayout layoutHome;


    private static final String TAG = EditSelfActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_edit);
        ButterKnife.bind(this);
        initActionBar();
        initTitleBar();

    }

    private void initTitleBar(){
        pActionBar.setActionBarLeftVisible();
        pActionBar.setActionBarTitleText("个人信息");
    }





//    @OnClick({R.id.layoutHome, R.id.layoutCheDeng, R.id.layoutTirepressure, R.id.layoutPerformance,R.id.layoutSelf})
//    public void onViewClicked(final View view) {
//        switch (view.getId()) {
////            case R.id.layoutHome:
////                changeTab(0,"首页");
////                vp.setCurrentItem(0,false);
////                break;
//
//        }
//    }

    @Override
    public void onLeftClick(View view) {
        super.onLeftClick(view);
        finish();
    }
}
