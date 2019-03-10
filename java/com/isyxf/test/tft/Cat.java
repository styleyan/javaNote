package com.isyxf.test.tft;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void run() {
        System.out.println("小猫快跑");
    }

    public void age() {
        System.out.println(18);
    }
}
