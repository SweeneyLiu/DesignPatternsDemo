package com.lsw.demo.factory.abstractfactory;


public class MacTextEditor extends TextEditor {

    @Override
    public void edit() {
        System.out.println("文本编辑器,edit -- Mac版");
    }

    @Override
    public void save() {
        System.out.println("文本编辑器, save -- Mac版");
    }

}
