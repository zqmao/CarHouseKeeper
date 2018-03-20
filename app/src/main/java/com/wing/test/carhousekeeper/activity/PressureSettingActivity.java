package com.wing.test.carhousekeeper.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.wing.test.carhousekeeper.R;

import org.greenrobot.eventbus.EventBus;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PressureSettingActivity extends BaseActivity {




    private static final String TAG = PressureSettingActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure_setting);
        ButterKnife.bind(this);
        initActionBar();
        initTitleBar();

    }

    private void initTitleBar(){
        pActionBar.setActionBarLeftVisible();
        pActionBar.setActionBarTitleText("胎压设置");
    }


    @Override
    public void onLeftClick(View view) {
        super.onLeftClick(view);
        finish();
    }
}
