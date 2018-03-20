package com.wing.test.carhousekeeper.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import android.widget.Toast;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Wing on 2017/5/15.
 */

public class AppUtils {


    //获取版本名
    public static String getVersionName(Context context) {
        return getPackageInfo(context).versionName;
    }

    //获取版本号
    public static int getVersionCode(Context context) {
        return getPackageInfo(context).versionCode;
    }

    //获取包名
    public static String getPackageName(Context context) {
        return getPackageInfo(context).packageName;
    }

    private static PackageInfo getPackageInfo(Context context) {
        PackageInfo pi = null;

        try {
            PackageManager pm = context.getPackageManager();
            pi = pm.getPackageInfo(context.getPackageName(),
                    PackageManager.GET_CONFIGURATIONS);

            return pi;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return pi;
    }

    //判断是否安装目标应用
    public static boolean isInstallByread(String packageName) {
        return new File("/data/data/" + packageName)
                .exists();
    }
    //拨打电话
    public static void call(Context context,String phone) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phone));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    //获取屏幕的宽度
    public static int getScreenWidth(Context context) {
        WindowManager manager = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        Display display = manager.getDefaultDisplay();
        return display.getWidth();
    }

    //获取屏幕的高度
    public static int getScreenHeight(Context context) {
        WindowManager manager = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        Display display = manager.getDefaultDisplay();
        return display.getHeight();
    }

    /**
     * �?单判断是否为手机号码
     *
     * @param num
     * @return
     */
    public static boolean isPhoneNum(String num) {
        // 确保每一位都是数�?
        return !TextUtils.isEmpty(num) && num.matches("1[0-9]{10}")
                && !isRepeatedStr(num) && !isContinuousNum(num);
    }

    /**
     * 判断是否为重复字符串
     *
     * @param str ，需要检查的字符�?
     */
    public static boolean isRepeatedStr(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int len = str.length();
        if (len <= 1) {
            return false;
        } else {
            char firstChar = str.charAt(0);// 第一个字�?
            for (int i = 1; i < len; i++) {
                char nextChar = str.charAt(i);// 第i个字�?
                if (firstChar != nextChar) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * 判断字符串是否为连续数字 45678901�?
     */
    public static boolean isContinuousNum(String str) {
        if (TextUtils.isEmpty(str))
            return false;
        if (!isNumbericString(str))
            return true;
        int len = str.length();
        for (int i = 0; i < len - 1; i++) {
            char curChar = str.charAt(i);
            char verifyChar = (char) (curChar + 1);
            if (curChar == '9')
                verifyChar = '0';
            char nextChar = str.charAt(i + 1);
            if (nextChar != verifyChar) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断是否为纯数字
     *
     * @param str ，需要检查的字符�?
     */
    public static boolean isNumbericString(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }

        Pattern p = Pattern.compile("^[0-9]+$");// 从开头到结尾必须全部为数�?
        Matcher m = p.matcher(str);

        return m.find();
    }

    public static void showToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

}
