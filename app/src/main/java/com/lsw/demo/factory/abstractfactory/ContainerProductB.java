package com.lsw.demo.factory.abstractfactory;

/**
 * Created by liushuwei on 2018/2/9.
 */

//容器产品B类
public class ContainerProductB extends ContainerProduct{
    @Override
    public void show() {
        System.out.println("生产出了容器产品B");
    }
}