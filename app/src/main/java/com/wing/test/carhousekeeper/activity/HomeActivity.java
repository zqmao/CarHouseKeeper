package com.wing.test.carhousekeeper.activity;

import android.os.Bundle;

import com.wing.test.carhousekeeper.R;

public class HomeActivity  extends BaseActivity {
    private static final String TAG = HomeActivity.class.getName();
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
    }
}
