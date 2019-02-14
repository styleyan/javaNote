package com.isyxf.test.lzw;

final class FinalClass {
    int a = 5;
    void doit() {}

    public static void main(String[] args) {
        FinalClass f = new FinalClass();

        f.a++;

        System.out.println(f.a);
    }
}
