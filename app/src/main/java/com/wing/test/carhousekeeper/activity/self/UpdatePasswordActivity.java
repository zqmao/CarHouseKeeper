package com.wing.test.carhousekeeper.activity.self;

import android.os.Bundle;
import android.view.View;
import com.wing.test.carhousekeeper.R;
import com.wing.test.carhousekeeper.activity.BaseActivity;
import com.wing.test.carhousekeeper.util.EventTypeBundle;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class UpdatePasswordActivity extends BaseActivity {

private static final String TAG = UpdatePasswordActivity.class.getName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_update_password);
        ButterKnife.bind(this);
        EventBus.getDefault().register(this);
        initActionBar();
        initTitleBar();

    }

    private void initTitleBar(){
        pActionBar.setActionBarLeftVisible();
        pActionBar.setActionBarTitleText("修改密码");
    }


    @OnClick({ R.id.imgHead})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.imgHead:
                pickerPopwindow.showPickerWindow(view);
                break;
        }
    }

    @Override
    public void onLeftClick(View view) {
        super.onLeftClick(view);
        finish();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe
    public void eventSubscriber(EventTypeBundle bundle) {
        switch (bundle.getType()) {
            case EventTypeBundle.TYPE_PICK_BY_TANKE_EVENT_SYNC:
                customHelper.onClick((View) bundle.getText(), getTakePhoto());
                break;
        }
    }
}
