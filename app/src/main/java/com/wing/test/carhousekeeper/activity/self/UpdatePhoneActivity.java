package com.wing.test.carhousekeeper.activity.self;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.wing.test.carhousekeeper.R;
import com.wing.test.carhousekeeper.activity.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class UpdatePhoneActivity extends BaseActivity {

private static final String TAG = UpdatePhoneActivity.class.getName();
    private boolean hasBind=true;

    @BindView(R.id.notBindLay)
    LinearLayout notBindLay;
    @BindView(R.id.hasBindLay)
    LinearLayout hasBindLay;
    @BindView(R.id.hasBindIv)
    ImageView hasBindIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_update_phone);
        ButterKnife.bind(this);
        initView();
    }
    private void initView(){
        initActionBar();
        initTitleBar();
        initCommonView();
    }
    private void initCommonView(){
        if(hasBind){
            notBindLay.setVisibility(View.GONE);
            hasBindLay.setVisibility(View.VISIBLE);
        }else{
            notBindLay.setVisibility(View.VISIBLE);
            hasBindLay.setVisibility(View.GONE);
        }
    }

    private void initTitleBar(){
        pActionBar.setActionBarLeftVisible();
        pActionBar.setActionBarTitleText("绑定/更换手机");
    }

    @OnClick({ R.id.hasBindIv})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.hasBindIv:
                notBindLay.setVisibility(View.VISIBLE);
                hasBindLay.setVisibility(View.GONE);
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
    }


}
