package com.isyxf.test.abso;

abstract class Aa extends Bb {
    public static final String BbStr = "AaStr";

    String getCc() {
        System.out.println(BbStr);
        return "ccc";
    }

    public Aa() {
    }

    public Aa(String aa) {
        System.out.println("Aa============" + aa);
    }
}
