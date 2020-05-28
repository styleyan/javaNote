package com.isyxf.refles;

import com.isyxf.refles.test.ReflectClass;

/**
 * @author xiaofei.yan
 * @Create 2020-03-10 15:44
 * @Descript 入口文件
 */
public class Main {
    public static void main(String[] args) {
        // 创建对象
        ReflectClass.reflectNewInstance();

        // 反射私有的构造方法
        ReflectClass.reflectPrivateConstructor();

        // 反射私有属性
        ReflectClass.reflectPrivateField();

        // 反射私有方法
        ReflectClass.reflectPrivateMethod();
    }
}
