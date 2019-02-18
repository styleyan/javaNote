package com.isyxf.test.classObject;

public abstract class Two {
    abstract void sayName();

    Two(){};

    Two(String a) {
        System.out.println(a);
    }

    abstract void three(String c);
}
