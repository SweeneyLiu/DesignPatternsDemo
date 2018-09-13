package com.lsw.demo.singleton;

/**
 * Created by liushuwei on 2017/6/15.
 * 静态内部类实现
 * 推荐使用，不仅能确保线程安全，而且保证单例对象的唯一性，延迟了单例的实例化
 */

public class StaticSingleton {

    private StaticSingleton(){

    }

    //在调用这个方法的时候去初始化SingleInstance
    public static StaticSingleton getInstance(){
        return SingleHolder.instance;
    }

    private static class SingleHolder{
        private static StaticSingleton instance = new StaticSingleton();
    }

}
