package com.lsw.demo.factory.abstractfactory;

/**
 * Created by liushuwei on 2018/2/9.
 */

public class FactoryA extends Factory {

    @Override
    public AbstractProduct manufactureContainer() {
        return new ContainerProductA();
    }

    @Override
    public AbstractProduct manufactureMould() {
        return new MouldProductA();
    }
}
