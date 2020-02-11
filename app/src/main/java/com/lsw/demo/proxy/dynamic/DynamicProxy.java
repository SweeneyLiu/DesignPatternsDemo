package com.lsw.demo.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 实现了InvocationHandler接口的动态代理类
 * Created by liushuwei on 2018/2/9.
 */

public class DynamicProxy implements InvocationHandler {

    private Object object;//真实对象的引用

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //通过反射调用真实对象的方法
        Object result = method.invoke(object,args);
        return result;
    }
}
