package com.wing.test.carhousekeeper.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.wing.test.carhousekeeper.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class UpdateEmailActivity extends BaseActivity {

private static final String TAG = UpdateEmailActivity.class.getName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_update_email);
        ButterKnife.bind(this);
        initView();
    }
    private void initView(){
        initActionBar();
        initTitleBar();
        initCommonView();
    }
    private void initCommonView(){

    }

    private void initTitleBar(){
        pActionBar.setActionBarLeftVisible();
        pActionBar.setActionBarTitleText("邮箱绑定");
    }

//    @OnClick({ R.id.hasBindIv})
//    public void onViewClicked(View view) {
//        switch (view.getId()) {
//            case R.id.hasBindIv:
//                notBindLay.setVisibility(View.VISIBLE);
//                hasBindLay.setVisibility(View.GONE);
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
