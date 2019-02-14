package com.isyxf.test.lzw;

import java.util.Random;

public class FinalStaticData {
    private static Random rand = new Random(); // 实例化一个 Random 类对象

    // 随机生产 0-10 之间的随机数赋予定义为 final 的 a1
    private final int a1 = rand.nextInt(10);

    // 随机产生 0-10 之间的随机数赋予定义为 static final 的 a2
    private static final int a2 = rand.nextInt(10);

    public static void main(String[] args) {
        FinalStaticData fdata = new FinalStaticData(); // 实例化一个对象

        // 调用定义为 final 的 a1
        System.out.println("实例化对象调用 final a1 的值:" + fdata.a1);

        // 调用定义为 static final 的 a2
        System.out.println("实例化读写调用 static final a2 的值:" + fdata.a2);

        // 实例化另外一个对象
        FinalStaticData fdata2 = new FinalStaticData();
        System.out.println("重新实例化对象调用 final a1 的值:" + fdata2.a1);
        System.out.println("重新实例化对象调用 static final a2 的值:" + fdata2.a2);
    }
}
