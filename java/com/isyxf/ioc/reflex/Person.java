package com.isyxf.ioc.reflex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class Person {
    String name;
    private int age;

    private String sa;

    @Autowired
    private Environment environment;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //包含一个带参的构造器和一个不带参的构造器
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public Person() {
        super();
    }


}
