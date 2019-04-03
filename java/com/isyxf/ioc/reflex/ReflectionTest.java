package com.isyxf.ioc.reflex;

import org.junit.Test;

import java.lang.reflect.Field;

public class ReflectionTest {
    @Test
    public void testClass() throws ClassNotFoundException, InstantiationError, IllegalAccessException{
        String str = "e,r,e,e,ee,";

        String[] strArr = str.split(",");

        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
    }
}
