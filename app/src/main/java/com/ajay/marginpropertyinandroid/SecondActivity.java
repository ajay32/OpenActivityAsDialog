package com.ajay.marginpropertyinandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ajay.recyclerviewwithswitchcases.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        this.setFinishOnTouchOutside(false);  //activity wont destory when user click outside the dialog box


    }
}
