package com.lsw.demo.proxy;

/**
 * Created by liushuwei on 2018/2/9.
 */

public class RealSubject implements Subject {
    @Override
    public void buyMac() {
        System.out.println("买一台mac");
    }
}
