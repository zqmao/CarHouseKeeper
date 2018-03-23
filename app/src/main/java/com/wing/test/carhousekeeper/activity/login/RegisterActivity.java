package com.wing.test.carhousekeeper.activity.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.wing.test.carhousekeeper.R;
import com.wing.test.carhousekeeper.activity.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends BaseActivity {

private static final String TAG = RegisterActivity.class.getName();
    @BindView(R.id.registerBtn)
    ImageView registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }

    @OnClick({ R.id.registerBtn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.registerBtn:
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
                break;
        }
    }




    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}
