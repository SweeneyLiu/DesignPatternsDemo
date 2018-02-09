package com.lsw.demo.factory.abstractfactory;

/**
 * Created by liushuwei on 2018/2/9.
 */

public class AbstractFactoryPattern {

    private static final String TAG = "AbstractFactoryPattern";
    
    public static void productObject(){
        FactoryA mFactoryA = new FactoryA();
        FactoryB mFactoryB = new FactoryB();
        //A厂当地客户需要容器产品A
        mFactoryA.manufactureContainer().show();
        //A厂当地客户需要模具产品A
        mFactoryA.manufactureMould().show();

        //B厂当地客户需要容器产品B
        mFactoryB.manufactureContainer().show();
        //B厂当地客户需要模具产品B
        mFactoryB.manufactureMould().show();
    }

}
