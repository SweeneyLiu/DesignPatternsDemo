package com.lsw.demo.factorymethod;

import android.util.Log;

/**
 * Created by liushuwei on 2018/2/9.
 */

public class ProductB extends Product {

    private static final String TAG = "ProductB";
    
    @Override
    public void show() {
        Log.i(TAG, "Show: ");
    }
}
