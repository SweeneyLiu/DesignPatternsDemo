package com.lsw.demo.observer;

/**
 * Created by sweeneyliu on 2019/9/16.
 */
public class WeixinUser implements Observer {
    // 微信用户名
    private String name;
    public WeixinUser(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}

