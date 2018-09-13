package com.lsw.demo.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liushuwei on 2018/9/13.
 * 使用容器实现单例模式
 */
public class SingletonManager {
    private static Map<String ,Object> objectMap = new HashMap<>();
    private SingletonManager(){

    }

    public static void registerService(String key,Object instance){
        if(!objectMap.containsKey(key)){
            objectMap.put(key,instance);
        }
    }

    public static Object getService(String key){
        return objectMap.get(key);
    }
}
