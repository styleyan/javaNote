package com.isyxf.test.car;

public class BoteRoyce extends Car implements Aircraft, Ays {
    void run() {
        System.out.println("向前");
    }

    public void cc() {
        System.out.println("我会cc");
    }

    void back() {
        System.out.println("向后");
    }

    public void fly() {
        System.out.println("飞");
    }
}
