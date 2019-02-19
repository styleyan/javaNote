package com.isyxf.test.lzw;

public class Hello {
    public static void main(String[] args) {
        String a = "go die, ";
        final String b = "final";
        String c = "go die, " + b;
        String d = a + b;
        String e = "go die, final";

        System.out.println(e == c); // true
        System.out.println(e == d); // false
        System.out.println(c.equals(d));  // true
    }
}
