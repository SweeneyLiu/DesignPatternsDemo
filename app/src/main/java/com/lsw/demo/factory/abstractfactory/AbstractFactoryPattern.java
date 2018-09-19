package com.lsw.demo.factory.abstractfactory;

/**
 * Created by liushuwei on 2018/2/9.
 */

public class AbstractFactoryPattern {

    private static final String TAG = "AbstractFactoryPattern";
    
    public static void productObject(){
        Factory factory = new MacFactory();
        TextEditor textEditor = factory.createTextEditor();
        textEditor.edit();
        textEditor.save();

        ImageEditor imageEditor = factory.createImageEditor();
        imageEditor.edit();
        imageEditor.save();
    }

}
