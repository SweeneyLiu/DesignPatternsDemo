package com.lsw.demo.observer;

/**
 * Created by sweeneyliu on 2019/9/16.
 */
public interface Subject {
    /**
     * 增加订阅者
     * @param observer
     */
    public void registerObserver(Observer observer);
    /**
     * 删除订阅者
     * @param observer
     */
    public void removeObserver(Observer observer);
    /**
     * 通知订阅者更新消息
     */
    public void notify(String message);
}
