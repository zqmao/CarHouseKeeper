package com.wing.test.carhousekeeper.fragment.self;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.wing.test.carhousekeeper.R;
import com.wing.test.carhousekeeper.activity.EditSelfActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by zqmao on 2018/3/3.
 */

public class SelfFragment extends Fragment{

    @BindView(R.id.photoNameLay)
    LinearLayout photoNameLay;

    private static SelfFragment mFragment;
    public static SelfFragment getInstance() {
        mFragment = new SelfFragment();
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
        View view = inflater.inflate(R.layout.car_fragment_self, null);
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

    @OnClick({R.id.photoNameLay})
    public void onViewClicked(final View view) {
        switch (view.getId()) {
            case R.id.photoNameLay:
                startActivity(new Intent(getActivity(), EditSelfActivity.class));
                break;

        }
    }
}
