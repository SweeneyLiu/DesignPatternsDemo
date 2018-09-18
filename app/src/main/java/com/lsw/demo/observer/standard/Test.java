package com.lsw.demo.observer.standard;

public class Test {
    public static void testStandard(){
        NumObserable numObserable = new NumObserable();
        NumObserver numObserver = new NumObserver();
        numObserable.addObserver(numObserver);
        numObserable.setData(1);
        numObserable.setData(2);
        numObserable.setData(3);
    }
}
