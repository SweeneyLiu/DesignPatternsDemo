package com.lsw.demo.factory.factorymethod;

/**
 * Created by liushuwei on 2018/2/9.
 */

public class FactoryB extends Factory {
    @Override
    public Product manufacture() {
        return new ProductB();
    }
}
