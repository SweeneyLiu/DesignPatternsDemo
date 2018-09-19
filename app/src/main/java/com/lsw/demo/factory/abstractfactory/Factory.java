package com.lsw.demo.factory.abstractfactory;

/**
 * Created by liushuwei on 2018/2/9.
 */

public abstract class Factory {
    public abstract TextEditor createTextEditor();
    public abstract ImageEditor createImageEditor();
}
