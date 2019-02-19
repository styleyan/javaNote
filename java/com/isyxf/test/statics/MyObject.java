package com.isyxf.test.statics;

/**
 * 静态方法中不能访问非静态成员方法和非静态成员变量，
 * 但是在非静态成员方法中是可以访问静态成员方法/变量的
 */
public class MyObject {
    private static String str1 = "staticProperty";
    private String str2 = "property";
    public String str3 = "property22";

    String str4 = "dddd";

    public void print1() {
        System.out.println(str1);
        System.out.println(str2);

        print1();
    }

    public static void print2() {
        System.out.println(str1);
    }
}
