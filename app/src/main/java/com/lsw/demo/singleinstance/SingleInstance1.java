package com.lsw.demo.singleinstance;

/**
 * Created by liushuwei on 2017/3/8.
 * 懒汉式
 * 使用synchronized 进行同步处理，并且双重判断是否为null
 */

public class SingleInstance1 {

    private static volatile SingleInstance1 singleInstance = null;

    private SingleInstance1(){

    }

    public static SingleInstance1 getSingleInstance() {
        if(singleInstance == null){
            synchronized (SingleInstance1.class){
                if(singleInstance == null){
                    singleInstance = new SingleInstance1();
                }
            }
        }
        return singleInstance;
    }
}
