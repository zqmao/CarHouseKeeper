package com.wing.test.carhousekeeper.activity;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import com.jph.takephoto.app.TakePhotoFragmentActivity;


import com.wing.test.carhousekeeper.R;
import com.wing.test.carhousekeeper.util.AppManager;
import com.wing.test.carhousekeeper.util.CustomHelper;
import com.wing.test.carhousekeeper.util.Finder;
import com.wing.test.carhousekeeper.view.CuteActionBar;
import com.wing.test.carhousekeeper.view.PicturePickerPopwindow;

/**
 * Created by Wing on 2017/5/10.
 */

public abstract class BaseActivity extends TakePhotoFragmentActivity implements CuteActionBar.OnActionBarClickListener{

    protected CuteActionBar pActionBar;
    protected CustomHelper customHelper;
    protected PicturePickerPopwindow pickerPopwindow;
    protected View notDataView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppManager.getInstance().addActivity(this);
        notDataView = LayoutInflater.from(this).inflate(R.layout.view_no_data,null,false);
        customHelper = CustomHelper.of(LayoutInflater.from(this).inflate(R.layout.common_layout, null));
        pickerPopwindow = new PicturePickerPopwindow(this, true);
    }


    /**
     * https://stackoverflow.com/questions/4828636/edittext-clear-focus-on-touch-outside/28939113#28939113
     * very diao! 2017 08 03
     * @param event
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            View v = getCurrentFocus();
            if ( v instanceof EditText) {
                Rect outRect = new Rect();
                v.getGlobalVisibleRect(outRect);
                if (!outRect.contains((int)event.getRawX(), (int)event.getRawY())) {
                    v.clearFocus();
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
            }
        }
        return super.dispatchTouchEvent( event );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AppManager.getInstance().finishActivity(this);
    }

    protected void initActionBar() {
        pActionBar = Finder.find(this, R.id.view_action_bar);
        if(pActionBar != null){
            pActionBar.setOnActionBarClickListener(this);
            pActionBar.setActionBarTitleText(getTitle().toString());

        }
//        layoutInflater = LayoutInflater.from(this);
        return;
    }

    @Override
    public void onLeftClick(View view) {

    }

    @Override
    public void onRightClick(View view) {

    }

    @Override
    public void onRightTitleClick(View view) {

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }

}
