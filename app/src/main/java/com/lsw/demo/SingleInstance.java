package com.lsw.demo;

/**
 * Created by liushuwei on 2017/3/8.
 */

public class SingleInstance {
    /*private static final SingleInstance ourInstance = new SingleInstance();

    public SingleInstance() {
    }

    public static SingleInstance getInstance() {
        return ourInstance;
    }*/

    private static SingleInstance singleInstance = null;

    public static SingleInstance getSingleInstance() {
        if(singleInstance == null){
            synchronized (SingleInstance.class){
                if(singleInstance == null){
                    singleInstance = new SingleInstance();
                }
            }
        }
        return singleInstance;
    }
}
