package com.lsw.demo.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by liushuwei on 2018/2/9.
 */

public class ProxyPattern {

    public static void getProxy(){

        RealSubject realSubject = new RealSubject();

        //获取被代理类的ClassLoader
        ClassLoader classLoader = realSubject.getClass().getClassLoader();
        //构造一个动态代理
        InvocationHandler dynamicProxy = new DynamicProxy(realSubject);

        Class[] classes = realSubject.getClass().getInterfaces();
//        Class[] classes = new Class[]{RealSubject.class};

        Subject subject = (Subject) Proxy.newProxyInstance(classLoader,classes,dynamicProxy);
        subject.buyMac();
    }
}
