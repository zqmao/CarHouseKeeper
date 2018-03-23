package com.wing.test.carhousekeeper.http;

/**
 * 服务器环境切换入口
 * Created by Wing on 2018/1/19.
 */

public class ServerEnvironment {
    public static final int SERVER_SIMULATE=1;//测试环境
    public static final int SERVER_RELASE=2;//正式环境
    public static int serverEnvironment=SERVER_SIMULATE;//环境变量，更改它来更改server接口环境
    public static  String URL_BASE;//server接口api的基本路径（ip 域名）

    static {
        if(serverEnvironment==SERVER_SIMULATE){
            URL_BASE = "http://192.168.1.171";
        }else {
            URL_BASE = "http://app.365kg.net";
        }
    }
}
