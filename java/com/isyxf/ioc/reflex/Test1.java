package com.isyxf.ioc.reflex;

public class Test1 implements OfficeBetter {
    @Override
    public void up() {
        System.out.println("启动了");
        this.say();
        this.sayNum();
    }

    public void say() {
        System.out.println("Test1 say");
    }

    public void sayNum() {
        System.out.println("sayNum");
    }
}
