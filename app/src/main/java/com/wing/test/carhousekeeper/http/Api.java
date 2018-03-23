package com.wing.test.carhousekeeper.http;

import android.text.TextUtils;

import com.orhanobut.hawk.Hawk;
import com.wing.test.carhousekeeper.util.LogUtils;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.io.File;


/**
 * Created by Wing on 2017/5/10.
 * 接口请求api
 */

public class Api {
    public static final int HTTP_FAILED = 1;
    public static final int HTTP_SUCCESSED = 0;
    public static final int HTTP_NEED_LOGIN = 99;
    public static final int SERVER_ERROR = 500;

    /**
     * http get 异步请求
     *
     * @param
     * @param params
     * @return
     */
    @SuppressWarnings("rawtypes")
    public static Callback.Cancelable get(RequestParams params,
                                          HttpCallBack httpCallBack) {
        return x.http().get(params, httpCallBack);
    }

    /**
     * http post 异步请求
     *
     * @param
     * @param params
     * @return
     */
    @SuppressWarnings("rawtypes")
    public static Callback.Cancelable post(RequestParams params,
                                           HttpCallBack httpCallBack) {
        return x.http().post(params, httpCallBack);
    }

    /**
     * 请求共同参数写这里
     *
     * @param
     * @return
     */
    public static RequestParams httpCommonParams(String url, HttpCallBack callBack) {
        callBack.showProgressDialog();
        RequestParams requestParams = new RequestParams(url);
        if(!TextUtils.isEmpty((String)Hawk.get("key"))){
            requestParams.addHeader("token", (String) Hawk.get("key"));
        }
        requestParams.addHeader("Req-Type", "APP");
        return requestParams;
    }

    /**
     * 发送短信
     */
    public static void httpSms(String phone, HttpCallBack callBack) {
        RequestParams params = httpCommonParams(UrlConstant.URL_SMS, callBack);
        params.addBodyParameter("phone", phone);
        post(params, callBack);
    }

    /**
     * 收货地址
     */
    public static void httpAddrs(HttpCallBack callBack) {
        RequestParams params = httpCommonParams(UrlConstant.URL_ADDRS, callBack);
        post(params, callBack);
    }

    /**
     * 删除地址
     */
    public static void httpDelAddr(int addrId, HttpCallBack httpCallBack) {
        RequestParams params = httpCommonParams(UrlConstant.URL_DELADDRS, httpCallBack);
        params.addBodyParameter("addrId", addrId + "");
        post(params, httpCallBack);
    }

    /**
     * 上传图片
     */
    public static void httpUpload(String path, HttpCallBack callBack) {
        RequestParams params = httpCommonParams(UrlConstant.URL_UPLOAD, callBack);
        params.addBodyParameter("file", new File(path));
        params.addBodyParameter("t", 1 + "");
        post(params, callBack);
    }


}
