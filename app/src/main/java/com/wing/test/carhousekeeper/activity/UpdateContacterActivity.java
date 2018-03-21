package com.wing.test.carhousekeeper.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.wing.test.carhousekeeper.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.wing.test.carhousekeeper.R.id.hasBindLay;
import static com.wing.test.carhousekeeper.R.id.notBindLay;

public class UpdateContacterActivity extends BaseActivity {

private static final String TAG = UpdateContacterActivity.class.getName();
    @BindView(R.id.infoLay)
    LinearLayout infoLay;
    @BindView(R.id.editInfoLay)
    LinearLayout editInfoLay;
    @BindView(R.id.finishBtn)
    ImageView finishBtn;

    private boolean isEdit=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_update_contacter);
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
        pActionBar.setActionBarTitleText("紧急联系人");
        pActionBar.setActionBarRightVisible();
        pActionBar.getActionBarRight().setImageResource(R.drawable.self_contacter_edit);
    }

    @OnClick({ R.id.finishBtn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.finishBtn:
                changeState();
                break;
        }
    }


    @Override
    public void onLeftClick(View view) {
        super.onLeftClick(view);
        if(isEdit){
            changeState();
        }else {
            finish();
        }
    }

    @Override
    public void onRightClick(View view) {
        super.onRightClick(view);
        changeState();
    }
    private void changeState(){
        isEdit=!isEdit;
        if(isEdit){
            infoLay.setVisibility(View.GONE);
            editInfoLay.setVisibility(View.VISIBLE);
            pActionBar.setActionBarRightGone();
        }else{
            infoLay.setVisibility(View.VISIBLE);
            editInfoLay.setVisibility(View.GONE);
            pActionBar.setActionBarRightVisible();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}
