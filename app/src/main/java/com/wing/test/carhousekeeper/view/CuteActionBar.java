package com.wing.test.carhousekeeper.view;


import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wing.test.carhousekeeper.R;
import com.wing.test.carhousekeeper.util.Finder;

/**
 * @Description: 通用头部
 * @author: wing
 */
public class CuteActionBar extends LinearLayout implements OnClickListener {

	private Context mContext;
	private View mView;
	private ImageButton ibLeft, ibRight;
	private TextView tvTitle, tvRightTitle;

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	public CuteActionBar(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		initConstructor(context);
	}

	public CuteActionBar(Context context, AttributeSet attrs) {
		super(context, attrs);
		initConstructor(context);
	}

	public CuteActionBar(Context context) {
		super(context);
		initConstructor(context);
	}

	private void initConstructor(Context context) {
		this.mContext = context;
		this.mView = LayoutInflater.from(mContext).inflate(
				R.layout.view_actionbar, null);
		this.ibLeft = Finder.find(mView, R.id.ib_left);
		this.ibRight = Finder.find(mView, R.id.ib_right);
		this.tvTitle = Finder.find(mView, R.id.tv_action_title);
		this.tvRightTitle = Finder.find(mView, R.id.tv_right_title);
		this.ibLeft.setOnClickListener(this);
		this.ibRight.setOnClickListener(this);
		this.tvRightTitle.setOnClickListener(this);
		LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.WRAP_CONTENT);
		addView(mView, params);
	}

	/**
	 * 设置标题
	 * @param str
	 */
	public void setActionBarTitleText(String str) {
		tvTitle.setText(str);
	}

	public void setActionBarRightText(String str) {
		tvRightTitle.setText(str);
	}

	public TextView getActionBarRightTitle() {
		return tvRightTitle;
	}

	public ImageButton getActionBarLeft() {
		return ibLeft;
	}

	public ImageButton getActionBarRight() {
		return ibRight;
	}

	public void setActionBarRightBackground(int resId) {
		ibRight.setImageResource(resId);
	}

	public TextView getActionBarTitle() {
		return tvTitle;
	}

	public void setActionBarLeftGone() {
		this.ibLeft.setVisibility(View.GONE);
	}

	public void setActionBarRightGone() {
		this.ibRight.setVisibility(View.GONE);
	}

	public void setActionBarRightVisible() {
		this.ibRight.setVisibility(View.VISIBLE);
	}

	public void setActionBarLeftVisible() {
		this.ibLeft.setVisibility(View.VISIBLE);
	}

	public void setActionBarRightTitleGone() {
		this.tvRightTitle.setVisibility(View.GONE);
	}

	public void setActionBarRightTitleVisible() {
		this.tvRightTitle.setVisibility(View.VISIBLE);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.ib_left:
			if (onActionBarClickListener != null) {
				onActionBarClickListener.onLeftClick(v);
			}
			break;

		case R.id.ib_right:
			if (onActionBarClickListener != null) {
				onActionBarClickListener.onRightClick(v);
			}
			break;
		case R.id.tv_right_title:
			if (onActionBarClickListener != null) {
				onActionBarClickListener.onRightTitleClick(v);
			}
		}
	}

	private OnActionBarClickListener onActionBarClickListener;

	public void setOnActionBarClickListener(
			OnActionBarClickListener onActionBarClickListener) {
		this.onActionBarClickListener = onActionBarClickListener;
	}

	public interface OnActionBarClickListener {
		/**
		 * 左侧点击事件
		 * 
		 * @param view
		 */
		public void onLeftClick(View view);

		/**
		 * 右侧点击事件
		 * 
		 * @param view
		 */
		public void onRightClick(View view);

		/**
		 * 右侧标题事件
		 * 
		 * @param view
		 */
		public void onRightTitleClick(View view);
	}

	public class OnActionBarDefaultListener implements OnActionBarClickListener {
		@Override
		public void onLeftClick(View view) {

		}

		@Override
		public void onRightClick(View view) {

		}

		@Override
		public void onRightTitleClick(View view) {

		}
	}

}
