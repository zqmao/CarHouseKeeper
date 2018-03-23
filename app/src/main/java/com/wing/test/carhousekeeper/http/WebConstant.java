package com.wing.test.carhousekeeper.http;

/**
 * Created by Wing on 2017/7/19.
 */

public class WebConstant {

   
    public static final String ARTICLE = ServerEnvironment.URL_BASE + "/user/article.do?type=1&id=";//头条详细
    public static final String HELP = ServerEnvironment.URL_BASE + "/user/help.do";//帮助协议

    public static final String REGISTER = ServerEnvironment.URL_BASE + "/user/article.do?type=2&id=5";//注册协议
    public static final String HUIYUAN = ServerEnvironment.URL_BASE + "/user/article.do?type=2&id=6";//会员协议
    public static final String GOODS_DETAIL = ServerEnvironment.URL_BASE + "/user/detail.do?id="; //商品详情链接


    public static final String LIMIT_GOODS_DETAIL = ServerEnvironment.URL_BASE + "/user/detail.do?type=1&id="; //抢购商品详情链接

    public static final String URL_ZHAOHUOGAN = ServerEnvironment.URL_BASE + "/user/workingDetail.do?workingId=";//找活干详情
    public static final String URL_GONGREN = ServerEnvironment.URL_BASE + "/user/workerDetail.do?workerId=";//工人详情
    public static final String URL_WUJIN = ServerEnvironment.URL_BASE + "/user/vendorDetail.do?vendorId=";//五金详情

    public static final String ABOUT_TT = ServerEnvironment.URL_BASE + "/shop/about2.do";//关于天天
    public static final String SHOP_DETAIL = ServerEnvironment.URL_BASE + "/user/shop.do?shopId=";//店铺详情
    public static final String SHOP_BANYUN = ServerEnvironment.URL_BASE + "/user/toll.do";//搬运收费标准
    public static final String HOME_BANNER_DETAIL = ServerEnvironment.URL_BASE + "/";//banner detail
    public static final String HOME_RULE = ServerEnvironment.URL_BASE + "/user/rule.do";//规则
    public static final String ORDER_FINISH = ServerEnvironment.URL_BASE + "/user/ddwc.do";//下单完成
    public static final String ORDER_DETAIL = ServerEnvironment.URL_BASE + "/user/orderDetail.do";//订单详情

    public static final String SHOP_NEWS = ServerEnvironment.URL_BASE + "/user/article.do?type=30&id=";//商家快讯

}
