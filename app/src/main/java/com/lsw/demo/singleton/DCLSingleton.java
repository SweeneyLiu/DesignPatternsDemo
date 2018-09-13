package com.lsw.demo.singleton;

/**
 * Created by liushuwei on 2017/6/15.
 * 饿汉式
 */

public class DCLSingleton {

    private static final DCLSingleton instance = new DCLSingleton();

    private DCLSingleton() {
    }

    public static DCLSingleton getInstance() {
        return instance;
    }
}
