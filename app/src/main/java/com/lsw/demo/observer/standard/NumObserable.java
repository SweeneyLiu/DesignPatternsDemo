package com.lsw.demo.observer.standard;

import java.util.Observable;

public class NumObserable extends Observable{

    private int data = 0;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
        setChanged();
        notifyObservers();
    }

}
