package com.wing.test.carhousekeeper.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Wing on 2017/5/10.
 */

public class MyViewPager extends ViewPager {

    private boolean scrollble = true;
    private int startX;
    private int startY;
    public MyViewPager(Context context) {
        super(context);
    }

    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }


    @Override
    public boolean onTouchEvent(MotionEvent ev)
    {
        if (!scrollble)
        {
            return true;
        }
        return super.onTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev)
    {

        switch (ev.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                startX = (int) ev.getX();
                startY = (int) ev.getY();
                break;
            case MotionEvent.ACTION_MOVE:

//                int dX = (int) (ev.getX() - startX);
                int dY = (int) (ev.getY() - startX);
                if (Math.abs(dY)>0)  // 说明上下方向滑动了
                {
                    return false;
                } else
                {
                    return true;
                }
            case MotionEvent.ACTION_UP:
                break;
        }

        return super.onInterceptTouchEvent(ev);
    }

    public boolean isScrollble()
    {
        return scrollble;
    }

    public void setScrollble(boolean scrollble)
    {
        this.scrollble = scrollble;
    }

}
