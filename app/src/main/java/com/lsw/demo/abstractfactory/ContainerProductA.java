package com.lsw.demo.abstractfactory;

/**
 * Created by liushuwei on 2018/2/9.
 */

//容器产品A类
public class ContainerProductA extends ContainerProduct{
    @Override
    public void show() {
        System.out.println("生产出了容器产品A");
    }
}