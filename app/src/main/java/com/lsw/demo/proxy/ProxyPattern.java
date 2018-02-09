package com.lsw.demo.proxy;

/**
 * Created by liushuwei on 2018/2/9.
 */

public class ProxyPattern {

    public static void getProxy(){
        Subject proxy = new Proxy();
        proxy.buyMac();
    }
}
