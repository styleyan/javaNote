package com.isyxf.ioc.reflex;

public class Test2 implements OfficeBetter {
    @Override
    public void up() {
        System.out.println("启动了22222");
        this.say();
        this.sayNum();
    }

    public void say() {
        System.out.println("Test22222 say");
    }

    public void sayNum() {
        System.out.println("sayNum22222");
    }
}
