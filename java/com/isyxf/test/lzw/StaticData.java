package com.isyxf.test.lzw;

public class StaticData {
    static int i = 5;

    int ii = 6;

    public static void main(String[] args) {
        StaticData staticData1 = new StaticData();

        StaticData staticData2 = new StaticData();

        staticData1.ii = 20;
        staticData1.i = 10;

        System.out.println(staticData2.i);

        final int VALUE_ONE;

    }
};

