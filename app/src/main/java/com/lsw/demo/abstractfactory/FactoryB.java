package com.lsw.demo.abstractfactory;

/**
 * Created by liushuwei on 2018/2/9.
 */

public class FactoryB extends Factory {

    @Override
    public AbstractProduct manufactureContainer() {
        return new ContainerProductB();
    }

    @Override
    public AbstractProduct manufactureMould() {
        return new MouldProductB();
    }
}
