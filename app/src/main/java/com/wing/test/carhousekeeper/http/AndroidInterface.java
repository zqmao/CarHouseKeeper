package com.wing.test.carhousekeeper.http;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

import com.google.gson.reflect.TypeToken;
import com.just.library.AgentWeb;
import org.greenrobot.eventbus.EventBus;


/**
 * Created by cenxiaozhong on 2017/5/14.
 */

public class AndroidInterface {

    private AgentWeb agent;
    private Context context;


    public AndroidInterface(AgentWeb agent, Context context) {
        this.agent = agent;
        this.context = context;
    }

    private Handler deliver = new Handler(Looper.getMainLooper());

    @JavascriptInterface
    public void callAndroid(final String msg) {


        deliver.post(new Runnable() {
            @Override
            public void run() {

                Log.i("Info", "main Thread:" + Thread.currentThread());
                Toast.makeText(context.getApplicationContext(), "" + msg, Toast.LENGTH_LONG).show();
            }
        });


        Log.i("Info", "Thread:" + Thread.currentThread());

        //对外接口


    }

//    //加入购物车
//    @JavascriptInterface
//    public void addCart(String productId, String type) {
////        agent.getJsEntraceAccess().quickCallJs("getUser","2311651564515");
//        Api.httpAddCart(false, Long.parseLong(productId), 0, type, new HttpCallBack(context, false, false, 0) {
//            @Override
//            public void onSuccess(String result) {
//                super.onSuccess(result);
//                BasetTwoBean basetTwoBean = ParserUtil.fromJson(result, new TypeToken<BasetTwoBean>() {
//                }.getType());
//                AppUtils.showToast(context, basetTwoBean.getMsg());
////                EventBus.getDefault().post(new EventTypeBundle(EventTypeBundle.TYPE_SORT_ADD_EVENT_SYNC));
//                EventBus.getDefault().post(new EventTypeBundle(EventTypeBundle.TYPE_SHOPCART_LIST_REFRESH_EVENT_SYNC));
//            }
//        });
//    }

//    //添加购物车（数量）
//    @JavascriptInterface
//    public void addCart2(String id, final String old, final String now) {
//        Api.httpAddCart(true, Long.parseLong(id), Integer.parseInt(now), "", new HttpCallBack(context, false, false, 0) {
//            @Override
//            public void onSuccess(String result) {
//                super.onSuccess(result);
//                BasetTwoBean basetTwoBean = ParserUtil.fromJson(result, new TypeToken<BasetTwoBean>() {
//                }.getType());
//                AppUtils.showToast(context, basetTwoBean.getMsg());
////                EventBus.getDefault().post(new EventTypeBundle(EventTypeBundle.TYPE_SORT_EDIT_COUNT_CHANG_EVENT_SYNC, Integer.parseInt(now) - Integer.parseInt(old)));
//            }
//        });
//    }

    //分享
    @JavascriptInterface
    public void share() {
        EventBus.getDefault().post(new EventTypeBundle(EventTypeBundle.TYPE_WEBVIEW_SHARE_EVENT_SYNC, 0));
    }

    //分享店铺
    @JavascriptInterface
    public void share2() {
        EventBus.getDefault().post(new EventTypeBundle(EventTypeBundle.TYPE_WEBVIEW_SHARE_EVENT_SYNC, 1));
    }

    //聊天
    @JavascriptInterface
    public void chat(String shopId,String shopName,String logo) {
        EventBus.getDefault().post(new EventTypeBundle(EventTypeBundle.TYPE_WEBVIEW_CHAT_EVENT_SYNC, shopName));
    }

//    //收藏/关注
//    @JavascriptInterface
//    public void collect(String id, String type) {
//        Api.httpCollect(Long.parseLong(id), Integer.parseInt(type), new HttpCallBack(context, true, false, 0) {
//            @Override
//            public void onSuccess(String result) {
//                super.onSuccess(result);
//                BasetTwoBean basetTwoBean = ParserUtil.fromJson(result, new TypeToken<BasetTwoBean>() {
//                }.getType());
//                AppUtils.showToast(context, basetTwoBean.getMsg());
//            }
//        });
////        EventBus.getDefault().post(new EventTypeBundle(EventTypeBundle.TYPE_WEBVIEW_COLLECT_EVENT_SYNC));
//    }

    //商品分类
    @JavascriptInterface
    public void products(String shopId, String name) {
//        KeyUtils.hideKeyboard(context);
//        EventBus.getDefault().post(new EventTypeBundle(EventTypeBundle.TYPE_GO_SHOP_SORT_SYNC, shopId + "," + name));
//        AppUtils.showToast(context,shopId+"..."+name);
    }

    //查看订单
    @JavascriptInterface
    public void showOrder() {
        EventBus.getDefault().post(new EventTypeBundle(EventTypeBundle.TYPE_SHOW_ORDER));
    }

}
