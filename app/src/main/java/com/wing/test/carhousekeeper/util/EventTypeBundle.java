package com.wing.test.carhousekeeper.util;

/**
 * Created by Administrator on 2016/8/9.
 */
public class EventTypeBundle {


    public static final int TYPE_PICK_BY_TANKE_EVENT_SYNC = 0x001;//拍照
    public static final int TYPE_PICK_BY_SELECT_EVENT_SYNC = 0x002;//选择图片

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
