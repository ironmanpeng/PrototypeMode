package com.pengtg.prototypemode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mTest = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTest = (Button)findViewById(R.id.test);
        mTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Login login = new LoginImpl();
                login.login();

                //获取已登录的User对象
                User newUser = LoginSession.getLoginSession().getLoginedUser();
                Log.d("pengtg_prototypemode","已登录用户: " + LoginSession.getLoginSession().getLoginedUser());

                newUser.address = new Address("长沙","星沙区","星沙街道");
                Log.d("pengtg_prototypemode","temp User: " + newUser);

                Log.d("pengtg_prototypemode","已登录用户: " + LoginSession.getLoginSession().getLoginedUser());

            }
        });
    }
}
