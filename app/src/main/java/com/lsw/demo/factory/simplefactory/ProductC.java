package com.lsw.demo.factory.simplefactory;

import android.util.Log;

/**
 * Created by liushuwei on 2018/2/9.
 */

public class ProductC extends Product {

    private static final String TAG = "ProductC";
    
    @Override
    public void Show() {
        Log.i(TAG, "Show: ");
    }
}
