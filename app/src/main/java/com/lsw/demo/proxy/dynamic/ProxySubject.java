package com.lsw.demo.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by liushuwei on 2018/2/9.
 */

public class ProxySubject implements InvocationHandler {

    private Object object;

    public ProxySubject(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object,args);
    }
}
