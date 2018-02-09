package com.lsw.demo.factory;

import android.util.Log;

/**
 * Created by liushuwei on 2018/2/9.
 */

public class ProductA extends Product {

    private static final String TAG = "ProductA";
    
    @Override
    public void Show() {
        Log.i(TAG, "Show: ");
    }
}
