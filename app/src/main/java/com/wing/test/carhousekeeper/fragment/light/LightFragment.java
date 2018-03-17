package com.wing.test.carhousekeeper.fragment.light;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.wing.test.carhousekeeper.R;
import com.wing.test.carhousekeeper.activity.LightSettingActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.wing.test.carhousekeeper.R.id.vp;

/**
 * Created by zqmao on 2018/3/3.
 */

public class LightFragment extends Fragment{
    @BindView(R.id.lightSetting)
    ImageView lightSetting;

    private static LightFragment mFragment;
    public static LightFragment getInstance() {
        mFragment = new LightFragment();
        return mFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.car_fragment_light, null);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    @OnClick({R.id.lightSetting})
    public void onViewClicked(final View view) {
        switch (view.getId()) {
            case R.id.lightSetting:
                startActivity(new Intent(getActivity(), LightSettingActivity.class));
                break;

        }
    }

}
