package com.isyxf.ioc.demo3;

public class Man {
    public Man() {
        System.out.println("Main被实例化了...");
    }

    public void setup() {
        System.out.println("Main被初始化了...");
    }

    public void teardown() {
        System.out.println("MAN被销毁了...");
    }
}
