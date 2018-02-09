package com.lsw.demo.factorymethod;

import android.util.Log;

/**
 * Created by liushuwei on 2018/2/9.
 */

public class FactoryPattern {

    private static final String TAG = "FactoryPattern";
    
    public static void productObject(){
        //客户要产品A
        FactoryA mFactoryA = new FactoryA();
        mFactoryA.manufacture().show();

        //客户要产品B
        FactoryB mFactoryB = new FactoryB();
        mFactoryB.manufacture().show();
    }

}
