package com.wing.test.carhousekeeper.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;

import java.util.List;
import java.util.Stack;

/**
 * Created by Wing on 2016/7/26.
 * 定义栈对activity进行管理
 */
public class AppManager {

    private static Stack<Activity> activityStack;
    private static volatile AppManager sInst = null; // <<< 这里添加了 volatile

    private AppManager() {
    }

    public static AppManager getInstance() {
        AppManager inst = sInst; // <<< 在这里创建临时变量
        if (inst == null) {
            synchronized (AppManager.class) {
                inst = sInst;
                if (inst == null) {
                    inst = new AppManager();
                    sInst = inst;
                }
            }
        }
        return inst; // <<< 注意这里返回的是临时变量
    }

    /**
     * 获取集合，判断APP是否在后台运行
     *
     * @return
     */
    public static Stack<Activity> getActivityStack() {
        return activityStack;
    }

    public static void setActivityStack(Stack<Activity> activityStack) {
        AppManager.activityStack = activityStack;
    }

    /**
     * 添加Activity到堆栈
     */
    public void addActivity(Activity activity) {
        if (activityStack == null) {
            activityStack = new Stack<Activity>();
        }
        activityStack.add(activity);
    }

    /**
     * 获取当前Activity（堆栈中最后一个压入的）
     */
    public Activity currentActivity() {
        if (activityStack == null || activityStack.isEmpty()) {
            return null;
        }
        Activity activity = activityStack.lastElement();
        return activity;
    }

    /**
     * 结束当前Activity（堆栈中最后一个压入的）
     */
    public void finishActivity() {
        Activity activity = activityStack.lastElement();
        finishActivity(activity);
    }

    /**
     * 结束指定的Activity
     */
    public void finishActivity(Activity activity) {
        if (activity != null) {
            activityStack.remove(activity);
            activity.finish();
            activity = null;
        }
    }

    /**
     * 结束指定类名的Activity
     */
    public void finishActivity(Class<?> cls) {
        for (Activity activity : activityStack) {
            if (activity.getClass().equals(cls)) {
                finishActivity(activity);
                return;
            }
        }
    }

    /**
     * 结束指定类名以外的Activity
     */
    public void finishOtherActivity(Class<?> cls) {
        for (Activity activity : activityStack) {
            if (!activity.getClass().equals(cls)) {
                if (null != activity) {
                    activity.finish();
                }
            }
        }
    }

    /**
     * 结束所有Activity
     */
    public void finishAllActivity() {
        for (int i = 0, size = activityStack.size(); i < size; i++) {
            if (null != activityStack.get(i)) {
                activityStack.get(i).finish();
            }
        }
        activityStack.clear();
    }

    /**
     * 退出应用程序
     *
     * System.exit(0);会造成退出app后，再次进入时，会白屏或者黑屏3秒左右才进入广告页面
     */
    @SuppressWarnings("deprecation")
    public void AppExit(Context context) {
        finishAllActivity();
        ActivityManager activityMgr = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        activityMgr.restartPackage(context.getPackageName());
    }

    /**
     * 判断当前activity是否存在
     */
    public boolean isActivity(Class<?> cls) {
        for (Activity activity : activityStack) {
            if (activity.getClass().equals(cls)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断应用是否已经启动
     *
     * @param context
     * @param packageName
     *            要判断应用的包名
     * @return
     */
    public static boolean isAppAlive(Context context, String packageName) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> processInfos = activityManager.getRunningAppProcesses();
        for (int i = 0; i < processInfos.size(); i++) {
            if (processInfos.get(i).processName.equals(packageName)) {
//                Log.i("NotificationLaunch---" + String.format("the %s is running, isAppAlive return true", packageName));
                return true;
            }
        }
//        AppLog.i("NotificationLaunch---" + String.format("the %s is not running, isAppAlive return false", packageName));
        return false;
    }
}
