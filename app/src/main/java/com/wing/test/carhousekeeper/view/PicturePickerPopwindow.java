package com.wing.test.carhousekeeper.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupWindow;

import com.wing.test.carhousekeeper.util.EventTypeBundle;
import com.wing.test.carhousekeeper.util.Finder;

import org.greenrobot.eventbus.EventBus;

import com.wing.test.carhousekeeper.R;

/**
 * Created by Wing on 2017/5/26.
 */

public class PicturePickerPopwindow extends PopupWindow implements View.OnClickListener{

    private Context context;
    private Button pic_from_paizhao,pic_from_galley,pic_cancel;
    boolean boo ;

    public PicturePickerPopwindow(Context context, boolean boo){
        this.context = context;
        this.boo = boo;
    }

    public void showPickerWindow(View parent){
        View view = Finder.inflate(context, R.layout.pop_picture_picker);
        pic_from_paizhao = Finder.find(view,R.id.btnPickByTake);
        pic_from_galley = Finder.find(view,R.id.btnPickBySelect);
        pic_cancel = Finder.find(view,R.id.pic_cancel);
        setWidth(WindowManager.LayoutParams.MATCH_PARENT);
        setHeight(WindowManager.LayoutParams.WRAP_CONTENT);
        setFocusable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setContentView(view);
        setAnimationStyle(R.style.picture_picker_animstyle);
        setOutsideTouchable(true);
        backgroundAlpha(0.5f);
        showAtLocation(parent, Gravity.BOTTOM,0,0);

        this.setOnDismissListener(new OnDismissListener() {
            @Override
            public void onDismiss() {
                backgroundAlpha(1.0f);
            }
        });
        pic_from_paizhao.setOnClickListener(this);
        pic_from_galley.setOnClickListener(this);
        pic_cancel.setOnClickListener(this);
    }


    /**
     * 设置添加屏幕的背景透明度
     *
     * @param bgAlpha
     */
    public void backgroundAlpha(float bgAlpha) {
        if (context instanceof Activity) {
            WindowManager.LayoutParams lp = ((Activity) context).getWindow().getAttributes();
            lp.alpha = bgAlpha; //0.0-1.0
            ((Activity) context).getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
            ((Activity) context).getWindow().setAttributes(lp);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnPickByTake:
            case R.id.btnPickBySelect:
                if(boo){
                    EventBus.getDefault().post(new EventTypeBundle(EventTypeBundle.TYPE_PICK_BY_TANKE_EVENT_SYNC,v));
                }else{
                    EventBus.getDefault().post(new EventTypeBundle(EventTypeBundle.TYPE_PICK_BY_SELECT_EVENT_SYNC,v));
                }
                dismiss();
                break;
            case R.id.pic_cancel:
                dismiss();
                break;
        }
    }
}
