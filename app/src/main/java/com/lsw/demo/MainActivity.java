package com.lsw.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lsw.demo.proxy.dynamic.ProxyPattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProxyPattern.getProxy();
    }
}
