package com.isyxf.test.anythDemo;

public class Cls extends Exc {
    private int a = 333;
    public int c = 2333;

//    public void setA(int a) {
//        this.a = a;
//    }
//
//    public int getA() {
//        return a;
//    }

    public static void main(String[] args) {
        Cls cls = new Cls();
        Cls cls1 = new Cls();

        cls1.a = 1000;
        cls1.c = 100229;
        System.out.println(cls.a);
        System.out.println(cls.c);

        System.out.println(cls1.a);
        System.out.println(cls1.c);
        System.out.println(cls1.getStr());
    }
}
