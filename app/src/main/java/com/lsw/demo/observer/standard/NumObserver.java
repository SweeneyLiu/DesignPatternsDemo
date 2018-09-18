package com.lsw.demo.observer.standard;

import java.util.Observable;
import java.util.Observer;

public class NumObserver implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        NumObserable numObserable  = (NumObserable)o;
        System.out.println("Data has changed to " +numObserable.getData());
    }
}
