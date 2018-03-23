package com.wing.test.carhousekeeper.activity.login;

import android.os.Bundle;
import android.view.View;

import com.wing.test.carhousekeeper.R;
import com.wing.test.carhousekeeper.activity.BaseActivity;
import com.wing.test.carhousekeeper.util.EventTypeBundle;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class RetrievePasswordActivity extends BaseActivity {

private static final String TAG = RetrievePasswordActivity.class.getName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_retrieve_password);
        ButterKnife.bind(this);
        initActionBar();
        initTitleBar();

    }

    private void initTitleBar(){
        pActionBar.setActionBarLeftVisible();
        pActionBar.setActionBarTitleText("找回密码");
    }


//    @OnClick({ R.id.imgHead})
//    public void onViewClicked(View view) {
//        switch (view.getId()) {
//            case R.id.imgHead:
//                pickerPopwindow.showPickerWindow(view);
//                break;
//        }
//    }

    @Override
    public void onLeftClick(View view) {
        super.onLeftClick(view);
        finish();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}
