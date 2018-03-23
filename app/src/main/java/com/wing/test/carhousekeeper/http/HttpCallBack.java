package com.wing.test.carhousekeeper.http;

import android.content.Context;

import com.google.gson.reflect.TypeToken;

import org.greenrobot.eventbus.EventBus;
import org.xutils.common.Callback;

import cn.ttkg.user.base.BasetTwoBean;
import cn.ttkg.user.util.AppUtils;
import cn.ttkg.user.util.LogUtils;
import cn.ttkg.user.util.NetUtils;
import cn.ttkg.user.util.ParserUtil;
import cn.ttkg.user.view.dialog.DialogFactory;
import cn.ttkg.user.view.dialog.SimpleLoadDialog;

/**
 * Created by Wing on 2017/5/10.
 */

public class HttpCallBack implements Callback.CommonCallback<String>, ProgressCancelListener {

    private Context context;
    private SimpleLoadDialog simpleLoadDialog;
    private boolean isShow;//请求是是否显示加载框
    private boolean isCanCancel;//正在加载的时候是否可以取消
    private int requestCode;
    DialogFactory dialogFactory;

    public HttpCallBack(Context context, boolean isShow, boolean isCanCancel,int requestCode) {
        dialogFactory = DialogFactory.getInstance();
        this.context = context;
        this.isCanCancel = isCanCancel;
        this.isShow = isShow;
        this.requestCode = requestCode;
    }


    @Override
    public void onSuccess(String result) {
        LogUtils.e("HttpCallBack", "onSuccess result:" + result);
        dismissProgressDialog();
        BasetTwoBean basetTwoBean = ParserUtil.fromJson(result, new TypeToken<BasetTwoBean>() {
        }.getType());
        if(basetTwoBean.getCode() ==  Api.HTTP_NEED_LOGIN){
            EventBus.getDefault().post(new EventTypeBundle(EventTypeBundle.TYPE_GO_LOGIN_SYNC));
            AppUtils.showToast(context,basetTwoBean.getMsg());
            return;
        }else if(basetTwoBean.getCode() ==  Api.SERVER_ERROR){
            AppUtils.showToast(context,basetTwoBean.getMsg());
            return;
        }
    }

    @Override
    public void onError(Throwable ex, boolean isCanCancel) {
        LogUtils.d("HttpCallBack" + "onError ex:" + ex.toString());
        dismissProgressDialog();
        if(!NetUtils.isConnected(context)){
            AppUtils.showToast(context,"请检查检查网络");
        }
    }

    @Override
    public void onCancelled(CancelledException cex) {
        dismissProgressDialog();
    }

    @Override
    public void onFinished() {
//        dismissProgressDialog();
    }


    @Override
    public void onCancelProgress() {
        if(!isCanCancel)
            return;
        dismissProgressDialog();
    }


    /**
     * 显示Dialog
     */
    public void showProgressDialog() {
        if (!isShow)
            return;
        simpleLoadDialog = new SimpleLoadDialog(context, this, true);
        if (simpleLoadDialog != null) {
            simpleLoadDialog.show();
        }
    }

    /**
     * 隐藏Dialog
     */
    public void dismissProgressDialog() {
        if (simpleLoadDialog != null) {
            simpleLoadDialog.dismiss();
            simpleLoadDialog = null;
        }
    }

}
