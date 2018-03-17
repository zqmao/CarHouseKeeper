package com.wing.test.carhousekeeper.activity;

import android.os.Bundle;
import android.view.View;

import com.wing.test.carhousekeeper.R;

import butterknife.ButterKnife;

public class LightSettingActivity extends BaseActivity {

//    @BindView(R.id.layoutHome)
//    LinearLayout layoutHome;


    private static final String TAG = LightSettingActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_setting);
        ButterKnife.bind(this);
        initActionBar();
        initTitleBar();

    }

    private void initTitleBar(){
        pActionBar.setActionBarLeftVisible();
        pActionBar.setActionBarTitleText("车灯设置");
        pActionBar.setActionBarRightVisible();
        pActionBar.getActionBarRight().setImageResource(R.drawable.home_page_right);
    }






    @Override
    public void onLeftClick(View view) {
        super.onLeftClick(view);
        finish();
    }
}
