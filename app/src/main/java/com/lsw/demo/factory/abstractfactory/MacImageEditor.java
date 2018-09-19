package com.lsw.demo.factory.abstractfactory;


public class MacImageEditor extends ImageEditor {

    @Override
    public void edit() {
        System.out.println("图片处理编辑器,edit -- Mac版");
    }

    @Override
    public void save() {
        System.out.println("图片处理编辑器, save -- Mac版");
    }

}
