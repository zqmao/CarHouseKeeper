package com.wing.test.carhousekeeper.http;

/**
 * Created by Administrator on 2016/8/9.
 */
public class EventTypeBundle {


    public static final int TYPE_PICK_BY_TANKE_EVENT_SYNC = 0x001;//拍照
    public static final int TYPE_PICK_BY_SELECT_EVENT_SYNC = 0x002;//选择图片
    public static final int TYPE_SORT_TOP_CLICK_EVENT_SYNC = 0x003;//点击分类顶部
    public static final int TYPE_DELETE_ADDRESS_EVENT_SYNC = 0x004;//删除地址
    public static final int TYPE_EDIT_ADDRESS_EVENT_SYNC = 0x005;//编辑地址进入
    public static final int TYPE_SYAYE_EDIT_OUT_EVENT_SYNC = 0x006;//编辑地址点击
    //    public static final int TYPE_SYAYE_COLLECT_EDIT_EVENT_SYNC = 0x007;//我的收藏编辑模式
//    public static final int TYPE_SYAYE_COLLECT_EDIT_OUT_EVENT_SYNC = 0x008;//我的收藏编辑模式退出
    public static final int TYPE_SYAYE_SELECT_ADDRESS_EVENT_SYNC = 0x009;//选择地址
    public static final int TYPE_SET_BANK_EVENT_SYNC = 0x010;//选择支付方式

    public static final int TYPE_SORT_ADD_EVENT_SYNC = 0x011;//辅材加
    public static final int TYPE_SORT_MINUS_EVENT_SYNC = 0x012;//辅材减
    public static final int TYPE_SORT_EDIT_COUNT_CHANG_EVENT_SYNC = 0x013;//输入框变化
    public static final int TYPE_SURE_ORDER_STORENAME_CHANG_EVENT_SYNC = 0x014;//确认订单 店铺选择
    public static final int TYPE_SPEC_SELECT_EVENT_SYNC = 0x015;//规格选择
    public static final int TYPE_SPEC_SELECT_EVENT_SYNC2 = 0x017;//规格选择取消
    public static final int TYPE_BRAND_SELECT_EVENT_SYNC = 0x016;//品牌选择
    public static final int TYPE_BRAND_SELECT_EVENT_SYNC2 = 0x018;//品牌选择取消
    public static final int TYPE_SORT_SHOPCART_COUNT_EVENT_SYNC = 0x019;//购物车总数
    public static final int TYPE_SORT_SHOPCART_REFRESH_EVENT_SYNC = 0x020;//购物车刷新
    public static final int TYPE_PRIVATE_ORDER_LIST2_EVENT_SYNC = 0x022;//私人订制二级菜单
    public static final int TYPE_PRIVATE_ORDER_LIST3_EVENT_SYNC = 0x023;//私人订制三级菜单
    public static final int TYPE_PRIVATE_ORDER_LIST_REFRESH_EVENT_SYNC = 0x024;//私人订制输入框
    public static final int TYPE_INQUIRY_BID_LIST_REFRESH_EVENT_SYNC = 0x025;//投标 刷新列表
    public static final int TYPE_SHOPCART_LIST_REFRESH_EVENT_SYNC = 0x026;//购物车删除 辅材刷新
    public static final int TYPE_BANYUNFEE_LOU_REFRESH_EVENT_SYNC = 0x027;//楼层 刷新搬运费
    public static final int TYPE_CANCEL_ORDER_REFRESH_EVENT_SYNC = 0x028;//取消订单刷新
    public static final int TYPE_WEBVIEW_SHARE_EVENT_SYNC = 0x029;//webview分享
    public static final int TYPE_WEBVIEW_CHAT_EVENT_SYNC = 0x030;//webview聊天
    public static final int TYPE_SELF_REFRESH_EVENT_SYNC = 0x031;//我的界面 刷新

    public static final int TYPE_RETURN_GOOD_JIAN_REFRESH_EVENT_SYNC = 0x032;// 退货价格 刷新
    public static final int TYPE_RETURN_GOOD_JIA_REFRESH_EVENT_SYNC = 0x033;//退货价格 刷新
    public static final int TYPE_WEBVIEW_COLLECT_EVENT_SYNC = 0x034;//收藏 / 关注
    public static final int TYPE_COLLECT_SHOPCART_EVENT_SYNC = 0x035;//收藏到购物车
    public static final int TYPE_ADD_BANKCARD_REFRESH_EVENT_SYNC = 0x036;//添加银行卡刷新
    public static final int TYPE_HOME_SEARCH_EVENT_SYNC = 0x037;//首页搜索
    public static final int TYPE_HOME_SEARCH_EVENT_SYNC2 = 0x038;//首页搜索
    public static final int TYPE_HOME_TO_SHOPCART_EVENT = 0x039;//
    public static final int TYPE_ORDER_PAY_EVENT = 0x040;//订单-去支付
    public static final int TYPE_INPUT_PSW_EVENT = 0x041;//支付密码
    public static final int TYPE_SHOP_QUAN_EVENT = 0x051;//选择商家优惠券

    public static final int TYPE_COLOR_SELECT_EVENT_SYNC = 0x052;//颜色搜索
    public static final int TYPE_COLOR_SELECT_EVENT_SYNC2 = 0x053;//颜色搜索 取消
    public static final int TYPE_BAITIAO_NOT_USE_SYNC = 0x054;//不使用白条
    public static final int TYPE_FINISH_QCODE_SYNC = 0x055;//关闭扫码
    public static final int TYPE_ORDER_CANCEL_SYNC = 0x056;//订单取消
    public static final int TYPE_GO_LOGIN_SYNC = 0x057;//跳登录

//    public static final int TYPE_GO_SHOP_SORT_SYNC = 0x058;//店铺分类
//    public static final int TYPE_GO_SHOP_SORT_SYNC2 = 0x059;//店铺分类
//    public static final int TYPE_GO_SHOP_SORT_SYNC3 = 0x060;//店铺分类

    public static final int TYPE_HOME_TO_SYNC = 0x061;//首页水电木油瓦
    public static final int TYPE_HOME_TO_SYNC2 = 0x062;//首页水电木油瓦
    public static final int TYPE_SHOW_ORDER = 0x063;//货到付款 查看订单
    public static final int TYPE_TO_HOME = 0x064;//都跳首页

    public static final int TYPE_SHOW_RED_POINT = 0x065;//显示小红点
    public static final int TYPE_DISMISS_RED_POINT = 0x066;//不显示小红点

    public static final int TYPE_HOME_BRAND_TO_SYNC = 0x067;//首页品牌
    public static final int TYPE_HOME_BRAND_TO_SYNC2 = 0x068;//首页品牌2
    public static final int TYPE_SHOP_NULL = 0x069;//品牌置空
    public static final int TYPE_SHOP_REFRESH = 0x070;//辅材刷新
    public static final int TYPE_SORT_AND_SHOPCART_REFRESH = 0x071;//辅材购物车刷新
    public static final int TYPE_GO_BUY = 0x072;//去逛逛
    public static final int TYPE_GOODS_RERUTN_REFRESH_EVENT_SYNC = 0x074;//退货刷新
    public static final int TYPE_ADD_ALIPAY_EVENT_SYNC = 0x075;//添加支付宝
    public static final int TYPE_SELECT_ALIPAY_EVENT_SYNC = 0x076;//选择支付宝
    public static final int TYPE_MONEY_REFRESH_EVENT = 0x077;//提现刷新
    public static final int TYPE_EXCHANGE_QUAN_EVENT = 0x078;//选择商家兑换券
    public static final int TYPE_STORE_ORDER_BRAND_SELECT_EVENT_SYNC = 0x079;//品牌选择-收藏下单

    public static final int TYPE_SHOPCART_REFRESH_EVENT_SYNC = 0x080;//购物车 刷新
    public int type;
    public Object message;

    public EventTypeBundle(int type) {
        this.type = type;
    }

    public EventTypeBundle(int type, Object message) {
        this.type = type;
        this.message = message;
    }

    public Object getText() {
        return message;
    }

    public int getType() {
        return type;
    }
}
