package com.isyxf.test.ab;

import org.junit.Test;

public class Dddd extends People {
    @Override
    public void run() {
        System.out.println("不是通过抽象类实现的方法");
    }

    @Test
    public void demo1(){
        System.out.println("dddd");
    }
}
