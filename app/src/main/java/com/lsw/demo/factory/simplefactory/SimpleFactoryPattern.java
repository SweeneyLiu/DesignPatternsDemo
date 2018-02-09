package com.lsw.demo.factory.simplefactory;

import android.util.Log;

/**
 * Created by liushuwei on 2018/2/9.
 */

public class SimpleFactoryPattern {

    private static final String TAG = "SimpleFactoryPattern";
    
    public static void productObject(){
        Factory mFactory = new Factory();

        //客户要产品A
        try {
            //调用工厂类的静态方法 & 传入不同参数从而创建产品实例
            mFactory.Manufacture("A").Show();
        }catch (NullPointerException e){
            Log.i(TAG, "productObject: 没有A产品");
        }

        //客户要产品B
        try {
            mFactory.Manufacture("B").Show();
        }catch (NullPointerException e){
            Log.i(TAG, "productObject: 没有B产品");
        }

        //客户要产品C
        try {
            mFactory.Manufacture("C").Show();
        }catch (NullPointerException e){
            Log.i(TAG, "productObject: 没有C产品");
        }
        
    }

}
