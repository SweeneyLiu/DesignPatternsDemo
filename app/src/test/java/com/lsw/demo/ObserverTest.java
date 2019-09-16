package com.lsw.demo;

import com.lsw.demo.observer.Subscription;
import com.lsw.demo.observer.WeixinUser;

import org.junit.Test;



public class ObserverTest {
    @Test
    public void test(){
        Subscription mSubscriptionSubject=new Subscription();
        //创建微信用户
        WeixinUser user1=new WeixinUser("杨影枫");
        WeixinUser user2=new WeixinUser("月眉儿");
        WeixinUser user3=new WeixinUser("紫轩");
        //订阅公众号
        mSubscriptionSubject.registerObserver(user1);
        mSubscriptionSubject.registerObserver(user2);
        mSubscriptionSubject.registerObserver(user3);
        //公众号更新发出消息给订阅的微信用户
        mSubscriptionSubject.notify("博客更新了");
    }
}