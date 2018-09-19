package com.lsw.demo.factory.abstractfactory;

public class MacFactory extends Factory{
    @Override
    public TextEditor createTextEditor() {
        return new MacTextEditor();
    }

    @Override
    public ImageEditor createImageEditor() {
        return new MacImageEditor();
    }

}
