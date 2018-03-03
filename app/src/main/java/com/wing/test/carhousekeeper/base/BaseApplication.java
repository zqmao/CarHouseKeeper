package com.wing.test.carhousekeeper.base;

import android.app.Application;
import android.support.multidex.MultiDex;
import com.wing.test.carhousekeeper.util.CrashHandler;
import org.xutils.x;


/**
 * Created by Wing on 2017/5/9.
 */

public class BaseApplication extends Application implements CrashHandler.ICrashHandler {

    private static BaseApplication mInstance;
    public static BaseApplication getInstance() {
        return mInstance;
    }

//    public static ImageOptions imageOptions_pinpai = new ImageOptions.Builder()
//            .setImageScaleType(ImageView.ScaleType.FIT_XY)
//            .setPlaceholderScaleType(ImageView.ScaleType.FIT_XY)
//            .setLoadingDrawableId(R.drawable.pinpai1)//加载中默认显示图片
//            .setFailureDrawableId(R.drawable.pinpai1)//加载失败后默认显示图片
//            .build();


    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
        mInstance = this;
        init();
    }

    private void init(){
        //优化app启动速度，第三方的初始化放在子线程中进行，
        // 环信这样操作UI或者有handler初始化的只能放在主线程中
       new Thread(){
            @Override
            public void run() {
                super.run();
                initCrashHandler();
                initXUtils();
            }
        }.start();
    }

    private void initXUtils() {
        x.Ext.init(this);
//        x.Ext.setDebug(org.xutils.BuildConfig.DEBUG); // 是否输出debug日志, 开启debug会影响性能.
    }

    private void initCrashHandler() {
        // 获取异常信息捕获类实例
        CrashHandler crashHandler = CrashHandler.getInstance(getApplicationContext());
        crashHandler.setICrashHandlerListener(this);
        // 初始化
        crashHandler.init(getApplicationContext());
    }

    /**
     * 全局未处理异常的处理
     * <p>
     * Description: 全局未处理异常的处理，界面层可以根据需要定制自己的业务，例如上传异常日志等。
     * <p>
     *
     * @param thread 线程信息
     * @param ex     异常等信息
     * @return 返回true代表事件被消耗掉了，底层不再处理。
     * @date 2014年3月5日
     */
    public boolean onGlobalUncaughtExceptionOccured(Thread thread, Throwable ex) {
        return false;
    }

    @Override
    public boolean onUncaughtExceptionOccured(Thread thread, Throwable ex) {
        return onGlobalUncaughtExceptionOccured(thread, ex);
    }


}
