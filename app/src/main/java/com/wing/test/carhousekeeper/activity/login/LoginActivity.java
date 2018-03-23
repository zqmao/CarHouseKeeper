package com.wing.test.carhousekeeper.activity.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.wing.test.carhousekeeper.R;
import com.wing.test.carhousekeeper.activity.BaseActivity;
import com.wing.test.carhousekeeper.activity.HomeActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {

private static final String TAG = LoginActivity.class.getName();
    @BindView(R.id.loginBtn)
    ImageView loginBtn;
    @BindView(R.id.registerBtn)
    TextView registerBtn;
    @BindView(R.id.retrievePasswordBtn)
    TextView retrievePasswordBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick({ R.id.loginBtn,R.id.registerBtn,R.id.retrievePasswordBtn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.loginBtn:
                startActivity(new Intent(LoginActivity.this,HomeActivity.class));
                break;
            case R.id.registerBtn:
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
                break;
            case R.id.retrievePasswordBtn:
                startActivity(new Intent(LoginActivity.this,RetrievePasswordActivity.class));
                break;
        }
    }




    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}
