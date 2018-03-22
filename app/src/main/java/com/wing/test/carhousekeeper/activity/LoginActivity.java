package com.wing.test.carhousekeeper.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.wing.test.carhousekeeper.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {

private static final String TAG = LoginActivity.class.getName();
    @BindView(R.id.loginBtn)
    ImageView loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick({ R.id.loginBtn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.loginBtn:
                startActivity(new Intent(LoginActivity.this,HomeActivity.class));
                break;
        }
    }




    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}
