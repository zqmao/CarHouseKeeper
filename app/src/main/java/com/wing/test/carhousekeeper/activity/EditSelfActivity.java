package com.wing.test.carhousekeeper.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.jph.takephoto.model.TResult;
import com.wing.test.carhousekeeper.R;
import com.wing.test.carhousekeeper.util.EventTypeBundle;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import jp.wasabeef.glide.transformations.CropCircleTransformation;

public class EditSelfActivity extends BaseActivity {


private static final String TAG = EditSelfActivity.class.getName();
    @BindView(R.id.imgHead)
    LinearLayout imgHead;
    private String imagePath;
    @BindView(R.id.headIv)
    ImageView headIv;

    @BindView(R.id.updatePassword)
    LinearLayout updatePassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_edit);
        ButterKnife.bind(this);
        EventBus.getDefault().register(this);
        initActionBar();
        initTitleBar();

    }

    private void initTitleBar(){
        pActionBar.setActionBarLeftVisible();
        pActionBar.setActionBarTitleText("个人信息");
    }


    @OnClick({ R.id.imgHead,R.id.updatePassword})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.imgHead:
                pickerPopwindow.showPickerWindow(view);
                break;
            case R.id.updatePassword:
                startActivity(new Intent(EditSelfActivity.this, UpdatePasswordActivity.class));
                break;
        }
    }

    @Override
    public void onLeftClick(View view) {
        super.onLeftClick(view);
        finish();
    }

    @Override
    public void takeCancel() {
        super.takeCancel();
    }

    @Override
    public void takeFail(TResult result, String msg) {
        super.takeFail(result, msg);
    }

    @Override
    public void takeSuccess(TResult result) {
        super.takeSuccess(result);
        imagePath = result.getImages().get(0).getCompressPath();
        Glide.with(EditSelfActivity.this).load(imagePath).
                diskCacheStrategy(DiskCacheStrategy.SOURCE).
                placeholder(R.drawable.default_head_img).
                bitmapTransform(new CropCircleTransformation(EditSelfActivity.this)).
                into(headIv);
    }
//        Api.httpUpload(imagePath, new HttpCallBack(this, true, false, 0) {
//            @Override
//            public void onSuccess(String result) {
//                super.onSuccess(result);
//                UploadBean uploadBean = ParserUtil.fromJson(result, new TypeToken<UploadBean>() {
//                }.getType());
//                if (uploadBean.getError() == Api.HTTP_SUCCESSED) {
//                    imgUrl = uploadBean.getUrl();
//                    Glide.with(PersonSettingActivity.this).load(imgUrl).diskCacheStrategy(DiskCacheStrategy.SOURCE).placeholder(R.drawable.head).bitmapTransform(new CropCircleTransformation(PersonSettingActivity.this)).into(imgHead);
//                }
//            }
//        });


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
