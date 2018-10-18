package com.lsw.demo.proxy.dynamic;

import android.util.Log;

/**
 * Created by liushuwei on 2018/2/9.
 */

public class RealSubject implements Subject {
    private static final String TAG = "RealSubject";
    @Override
    public void buyMac() {
        Log.i(TAG, "buyMac: real");
    }
}
