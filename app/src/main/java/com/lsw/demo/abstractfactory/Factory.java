package com.lsw.demo.abstractfactory;

/**
 * Created by liushuwei on 2018/2/9.
 */

public abstract class Factory {
    public abstract AbstractProduct manufactureContainer();
    public abstract AbstractProduct manufactureMould();
}
