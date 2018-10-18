package com.lsw.demo.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * Created by liushuwei on 2018/2/9.
 */

public class ProxyPattern {

    public static void getProxy(){
        Subject subject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(),RealSubject.class.getInterfaces(),new ProxySubject(new RealSubject()));
        subject.buyMac();
    }
}
