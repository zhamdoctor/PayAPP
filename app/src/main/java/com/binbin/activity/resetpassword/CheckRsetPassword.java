package com.binbin.activity.resetpassword;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.binbin.activity.R;

public class CheckRsetPassword extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_rset_password);
    }
    public void nextStep(View view){
        Intent intent = new Intent();
        intent.setClass(this,GetRsetPassword.class);
        startActivity(intent);
    }
}
