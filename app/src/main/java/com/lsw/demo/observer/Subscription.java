package com.lsw.demo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sweeneyliu on 2019/9/16.
 */
public class Subscription implements Subject {
    //储存订阅公众号的微信用户
    private List<Observer> weixinUserlist = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        weixinUserlist.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        weixinUserlist.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weixinUserlist) {
            observer.update(message);
        }
    }
}
