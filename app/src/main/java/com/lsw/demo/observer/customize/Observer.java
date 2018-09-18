package com.lsw.demo.observer.customize;

public interface Observer<T> {
    void onUpdate(Observable<T> observable,T data);
}
