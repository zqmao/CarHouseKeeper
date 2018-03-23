package com.wing.test.carhousekeeper.http;

/**
 * Created by Wing on 2017/5/10.
 * 存放url
 */

public class UrlConstant {

    public static final String URL_REGISTER = ServerEnvironment.URL_BASE + "/app/register.do";//注册
    public static final String URL_SMS = ServerEnvironment.URL_BASE + "/app/sms.do";//短信
    public static final String URL_LOGIN = ServerEnvironment.URL_BASE + "/app/login.do";//登录
    public static final String URL_FORGET_PSW = ServerEnvironment.URL_BASE + "/app/forgetPwd.do";//忘记密码
    public static final String URL_PAY = ServerEnvironment.URL_BASE + "/app/order/charge.do";//支付
    public static final String URL_MINE = ServerEnvironment.URL_BASE + "/app/mine.do";//我的
    public static final String URL_INDEX = ServerEnvironment.URL_BASE + "/app/index.do";//首页数据
    public static final String URL_NEW_INDEX = ServerEnvironment.URL_BASE + "/app/newIndex.do";//首页数据
    public static final String URL_PRODUCT_INIT = ServerEnvironment.URL_BASE + "/app/product/init.do";//商品 初始化
    public static final String URL_PRODUCT_LIST = ServerEnvironment.URL_BASE + "/app/product/list.do";//商品列表
    public static final String URL_APP_INIT = ServerEnvironment.URL_BASE + "/app/init.do";//应用初始化
    public static final String URL_APP_HOTS = ServerEnvironment.URL_BASE + "/app/hots.do";//首页热门商品列表
    public static final String URL_TOP_ARTICLE = ServerEnvironment.URL_BASE + "/app/articles.do";//头条列表
    public static final String URL_ADD_CART = ServerEnvironment.URL_BASE + "/app/cart/add.do";//添加购物车
    public static final String URL_GET_CART = ServerEnvironment.URL_BASE + "/app/cart/get.do";//获取购物车
    public static final String URL_CART_DEl = ServerEnvironment.URL_BASE + "/app/cart/delete.do";//购物车删除
    public static final String URL_APP_WORK = ServerEnvironment.URL_BASE + "/app/works.do";//找活干
    public static final String URL_APP_WORKERS = ServerEnvironment.URL_BASE + "/app/workers.do";//找工人
    public static final String URL_APP_VENDORS = ServerEnvironment.URL_BASE + "/app/vendors.do";//找五金
    public static final String URL_APP_TTD = ServerEnvironment.URL_BASE + "/app/ttd.do";//天天贷
    public static final String URL_CUSTOMINIT = ServerEnvironment.URL_BASE + "/app/customInit.do";//个性化定制分类初始化数据
    public static final String URL_CUSTOM = ServerEnvironment.URL_BASE + "/app/custom.do";//私人订制申请
    public static final String URL_INQUIRYS = ServerEnvironment.URL_BASE + "/app/inquirys.do";//发标询价列表
    public static final String URL_INQUIRYS2 = ServerEnvironment.URL_BASE + "/app/myinquirys.do";//发标询价列表2
    public static final String URL_INQUIRYS_DETAIL = ServerEnvironment.URL_BASE + "/app/inquiryDetail.do";//发表询价详情
    public static final String URL_INQUIRYS_PAGE = ServerEnvironment.URL_BASE + "/app/inquiryPage.do";//投标列表
    public static final String URL_INQUIRYS_BID = ServerEnvironment.URL_BASE + "/app/inquiryBid.do";//投标
    public static final String URL_INQUIRY = ServerEnvironment.URL_BASE + "/app/inquiry.do";//发标
    public static final String URL_RUSHREC = ServerEnvironment.URL_BASE + "/app/rushRec.do";//抢购列表-banner
    public static final String URL_RUSHPAGE = ServerEnvironment.URL_BASE + "/app/rushPage.do";//抢购列表
    public static final String URL_ADD_ADDR = ServerEnvironment.URL_BASE + "/app/addAddr.do";//新增收货地址
    public static final String URL_ADDRS = ServerEnvironment.URL_BASE + "/app/addrs.do";//收货地址
    public static final String URL_DELADDRS = ServerEnvironment.URL_BASE + "/app/delAddr.do";//删除地址
    public static final String URL_UPLOAD = ServerEnvironment.URL_BASE + "/upload.do";//图片上传
    public static final String URL_ORDER_INIT = ServerEnvironment.URL_BASE + "/app/order/init.do";//下单数据初始化
    public static final String URL_ORDER_SUBMIT = ServerEnvironment.URL_BASE + "/app/order/submit.do";//下单
    public static final String URL_COUPONS = ServerEnvironment.URL_BASE + "/app/coupons.do";//优惠券
    public static final String URL_IOUS = ServerEnvironment.URL_BASE + "/app/order/getIou.do";//获取白条列表
    //    public static final String URL_SHOP_COUPONS = ServerEnvironment.URL_BASE + "/app/order/getCoupons.do";//获取商家优惠券
    public static final String URL_SHOP_COUPONS = ServerEnvironment.URL_BASE + "/app/order/getRightCoupons.do";//获取商家优惠券2
    public static final String URL_PAYDEAL = ServerEnvironment.URL_BASE + "/app/order/payDeal.do";//订单支付
    public static final String URL_SHOP_COLLECTS = ServerEnvironment.URL_BASE + "/app/shopCollects.do";//店铺关注列表
    public static final String URL_PRO_COLLECTS = ServerEnvironment.URL_BASE + "/app/proCollects.do";//店铺收藏列表
    public static final String URL_GET_FIRST_CATE = ServerEnvironment.URL_BASE + "/app/getFirstCate.do";//获取一级分类
    public static final String URL_SHOPS = ServerEnvironment.URL_BASE + "/app/product/shops.do";//品牌馆
    public static final String URL_ORDER_LIST = ServerEnvironment.URL_BASE + "/app/order/list.do";//订单列表
    public static final String URL_GONGZHANG_VERVITY = ServerEnvironment.URL_BASE + "/app/auth/manager.do";//工长认证
    public static final String URL_GONGSI_VERVITY = ServerEnvironment.URL_BASE + "/app/auth/company.do";//公司认证
    public static final String URL_GONGREN_VERVITY = ServerEnvironment.URL_BASE + "/app/auth/worker.do";//工人认证
    public static final String URL_WUJIN_VERVITY = ServerEnvironment.URL_BASE + "/app/auth/vendor.do";//五金店认证
    public static final String URL_CANCEL_ORDER = ServerEnvironment.URL_BASE + "/app/order/cancelOrder.do";//取消订单
    public static final String URL_CONFIRM_ORDER = ServerEnvironment.URL_BASE + "/app/order/confirmOrder.do";//确认收货
    public static final String URL_SEE_CODE = ServerEnvironment.URL_BASE + "/app/order/seeCode.do";//查看确认码
    public static final String URL_IOU_APPLY = ServerEnvironment.URL_BASE + "/app/iouApply.do";//申请白条
    public static final String URL_SALERS = ServerEnvironment.URL_BASE + "/app/getSalers.do";//获取分销商
    public static final String URL_IOU_DETAIL = ServerEnvironment.URL_BASE + "/app/iouDetail.do";//白条详细
    public static final String URL_IOU_BILL = ServerEnvironment.URL_BASE + "/app/iouBill.do";//白条账单
    public static final String URL_INVITES = ServerEnvironment.URL_BASE + "/app/invites.do";//邀请列表
    public static final String URL_MY_TTD = ServerEnvironment.URL_BASE + "/app/myloan.do";//我的天天贷
    public static final String URL_SAVE_INFO = ServerEnvironment.URL_BASE + "/app/saveInfo.do";//保存个人信息
    public static final String URL_ORDER_PHOTO = ServerEnvironment.URL_BASE + "/app/order/photo.do";//拍照下单
    public static final String URL_FIND_WORK = ServerEnvironment.URL_BASE + "/app/findWork.do";//找活干
    public static final String URL_REVIEW = ServerEnvironment.URL_BASE + "/app/order/review.do";//评价
    public static final String URL_ORDER_DETAIL = ServerEnvironment.URL_BASE + "/app/order/detail.do";//订单详情
    public static final String URL_ORDER_SEE_LOG = ServerEnvironment.URL_BASE + "/app/order/seeLog.do";//查看物流
    public static final String URL_REFUND = ServerEnvironment.URL_BASE + "/app/order/refund.do";//申请退款
    public static final String URL_REFUNDS = ServerEnvironment.URL_BASE + "/app/order/refunds.do";//退货列表
    public static final String URL_COLLECT = ServerEnvironment.URL_BASE + "/app/collect.do";//收藏关注
    public static final String URL_COLLECT_DEL = ServerEnvironment.URL_BASE + "/app/delCollect.do";//收藏关注 取消
    public static final String URL_ADD_BANKCARD = ServerEnvironment.URL_BASE + "/app/addBank.do";//添加银行卡
    public static final String URL_WD_INIT = ServerEnvironment.URL_BASE + "/app/wdInit.do";//获取银行卡
    public static final String URL_ADD_WD = ServerEnvironment.URL_BASE + "/app/addBank.do";//添加银行卡
    public static final String URL_FUNDEYAILS = ServerEnvironment.URL_BASE + "/app/fundetails.do";//资金明细
    public static final String URL_POINTS = ServerEnvironment.URL_BASE + "/app/points.do";//积分明细
    public static final String URL_FORGET_PAYPSW = ServerEnvironment.URL_BASE + "/app/forgetPaypwd.do";//忘记支付密码
    public static final String URL_REFUND_CONFIRM = ServerEnvironment.URL_BASE + "/app/order/refundConfirm.do";//确认退货
    public static final String URL_REFUND_REFUSE = ServerEnvironment.URL_BASE + "/app/order/refundRefuse.do";//拒绝退货
    public static final String URL_GET_BY_SHOP = ServerEnvironment.URL_BASE + "/app/cart/getByShop.do";//获取购物列表【商家】
    public static final String URL_REPAY = ServerEnvironment.URL_BASE + "/app/repay.do";//白条还款
    public static final String URL_GOOD_DETAIL = ServerEnvironment.URL_BASE + "/app/product/detail.do";//商品详情；
    public static final String URL_GOOD_REC = ServerEnvironment.URL_BASE + "/app/product/recs.do";// 推荐商品
    public static final String URL_GOOD_REVIEW = ServerEnvironment.URL_BASE + "/app/product/reviews.do";// 商品评价
    public static final String URL_STORE_HOME = ServerEnvironment.URL_BASE + "/app/product/shopIndex.do";// 店铺首页
    public static final String URL_GET_USER = ServerEnvironment.URL_BASE + "/app/getUser.do";//
    public static final String URL_GET_DISCOUNT = ServerEnvironment.URL_BASE + "/app/order/getDiscount.do";//获取折扣
    public static final String URL_COLLECT_COUNTS = ServerEnvironment.URL_BASE + "/app/collectsCount.do";//收藏里的各分类数量
    public static final String URL_REBACK_CART = ServerEnvironment.URL_BASE + "/app/order/againOrder.do";//取消订单重回购物车
    public static final String URL_WITH_DRAW = ServerEnvironment.URL_BASE + "/app/order/withdraw.do";//申请提现
    public static final String URL_MY_WALLET = ServerEnvironment.URL_BASE + "/app/shop/wallet.do";//我的钱包
    public static final String URL_COLLECT_ONE = ServerEnvironment.URL_BASE + "/app/collect/brands.do";//收藏 商家信息 和一个商品
    public static final String URL_COLLECT_TWO = ServerEnvironment.URL_BASE + "/app/collect/proCollects.do";//收藏 分类下 一个商家 的所有收藏商品
    public static final String URL_STORE_HOME_KEFU = ServerEnvironment.URL_BASE + "/app/getShopCustomerService.do";// 店铺首页
    public static final String URL_SHOP_CATEGORY = ServerEnvironment.URL_BASE + "/app/product/shopsCategory.do";// 最新品牌馆
    public static final String URL_QUICK_ORDER = ServerEnvironment.URL_BASE + "/app/order/quickOrder.do";// 收藏下单 分类 品牌
    public static final String URL_COLLOECT_SELECT = ServerEnvironment.URL_BASE + "/app/order/collectSelect.do";// 收藏下单 商品
    public static final String URL_NEW_SHOP_INDEX = ServerEnvironment.URL_BASE + "/app/product/newShopIndex.do";//商家首页数据
    public static final String URL_SET_DEFAULT_ADDR = ServerEnvironment.URL_BASE + "/app/defaultAddr.do";//我的
}
