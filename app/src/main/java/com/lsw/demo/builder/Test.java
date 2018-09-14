package com.lsw.demo.builder;

public class Test {

    public static  Person getPerson(){
        Person.Builder builder=new Person.Builder();
        Person person=builder
                .name("张三")
                .age(18)
                .height(178.5)
                .weight(67.4)
                .build();
        return person;
    }
}
