package com.lsw.demo.singleinstance;

/**
 * Created by liushuwei on 2017/6/15.
 * 静态内部类实现
 */

public class SingleInstance3 {


    private static class Inner{
        private static SingleInstance3 instance = new SingleInstance3();
    }

    private SingleInstance3(){

    }

    public static SingleInstance3 getInstance(){
        return Inner.instance;
    }

}
