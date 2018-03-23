package com.wing.test.carhousekeeper.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.just.library.AgentWebConfig;
import com.orhanobut.hawk.Hawk;
import org.greenrobot.eventbus.EventBus;
import java.net.MalformedURLException;
import java.net.URL;
/**
 * Created by Wing on 2017/7/19.
 */

public class WebActivity extends BaseWebActivity {

    String url = "";

    @Override
    public String getUrl() {
        switch (getIntent().getIntExtra("type",1)){
//            case 1://头条详细
//                url = WebConstant.ARTICLE+getIntent().getIntExtra("id",0);
//                break;
//            case 2://注册协议
//                url = WebConstant.REGISTER;
//                break;
//            case 3://会员协议
//                url = WebConstant.HUIYUAN;
//                break;
//            case 4://商品详情
//                url = WebConstant.GOODS_DETAIL+getIntent().getIntExtra("id",0);
//                break;
//            case 5://抢购商品详情
//                url = WebConstant.LIMIT_GOODS_DETAIL+getIntent().getIntExtra("id",0);
//                break;
//            case 6://找活干详情
//                url = WebConstant.URL_ZHAOHUOGAN + getIntent().getIntExtra("id",0);
//                break;
//            case 7://工人详情
//                url = WebConstant.URL_GONGREN + getIntent().getIntExtra("id",0);
//                break;
//            case 8://五金详情
//                url = WebConstant.URL_WUJIN + getIntent().getIntExtra("id",0);
//                break;
//            case 9://帮助中心
//                url = WebConstant.HELP;
//                break;
//            case 10://关于天天
//                url = WebConstant.ABOUT_TT;
//                break;
//            case 11://店铺详情
//                url = WebConstant.SHOP_DETAIL + getIntent().getIntExtra("id",0);
//                break;
//            case 12://运费收费标准
//                url = WebConstant.SHOP_BANYUN;
//                break;
//            case 13://首页banner详情
//                url = WebConstant.HOME_BANNER_DETAIL + getIntent().getStringExtra("url");
//                break;
//            case 14:
//                url = WebConstant.HOME_RULE;
//                break;
//            case 15://下单完成
//                url = WebConstant.ORDER_FINISH + getIntent().getStringExtra("url");
//                break;
//            case 16://订单详情
//                url = WebConstant.ORDER_DETAIL + getIntent().getStringExtra("url");
//                break;
//            case 30://商家快讯
//                url = WebConstant.SHOP_NEWS + getIntent().getIntExtra("id",0);
//                break;
        }
        return url;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        try {
            URL ur = new URL(url);
            if(!TextUtils.isEmpty((String)Hawk.get("key"))){
                AgentWebConfig.syncCookies(ur.getProtocol() + "://" + ur.getHost(),"token="+Hawk.get("key"));
            }
            AgentWebConfig.syncCookies(ur.getProtocol() + "://" + ur.getHost(),"device=android");
//            AgentWebConfig.syncCookies(ur.getProtocol() + "://" + ur.getHost(),"areaId="+CommonParam.areaId);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        /** attention to this below ,must add this**/
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
        mAgentWeb.clearWebCache();
//        KeyUtils.hideKeyboard(this);
    }
}
