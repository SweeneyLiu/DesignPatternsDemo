package com.lsw.demo.singleton;

/**
 * Created by liushuwei on 2017/3/8.
 * DCL(double check lock)
 * 使用synchronized 进行同步处理，并且双重判断是否为null
 */

public class Singleton {

//    使用volatile的原因：
//    1.在jdk1.5之前无法保证执行顺序，会导致DCL失效
//    所以需要通过volatile来保证程序的正确性（或多或少影响性能）
    private static volatile Singleton singleInstance = null;

    private Singleton(){

    }

    public static Singleton getSingleInstance() {
        //第一层判断主要为了避免不必要的同步
        if(singleInstance == null){
            synchronized (Singleton.class){
                //第二层判断主要为了在singleInstance为空的时候创建实例
                if(singleInstance == null){
                    singleInstance = new Singleton();
                }
            }
        }
        return singleInstance;
    }
}
