package com.isyxf.test.cls;

public abstract class AbstractTwo {
    abstract void sayName();

    AbstractTwo(){};

    AbstractTwo(String a) {
        System.out.println(a);
    }

    abstract void three(String c);

     void ccc(String ccc) {
        System.out.println(ccc);
    }
}
