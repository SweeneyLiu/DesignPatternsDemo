package com.lsw.demo;

/**
 * Created by liushuwei on 2017/6/15.
 * 饿汉式
 */

public class SingleInstance2 {

    private static final SingleInstance2 instance = new SingleInstance2();

    private SingleInstance2() {
    }

    public static SingleInstance2 getInstance() {
        return instance;
    }
}
