package com.isyxf.test.fn;

public class Car extends Prop implements Getinfo {
    public String getValue() {
        System.out.println("ccc");
        return "dddd";
    }

    public String getName() {
        System.out.println("name");
        return "name";
    }
}
