package com.isyxf.refles.test;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author xiaofei.yan
 * @Create 2020-03-10 17:53
 * @Descript 反射逻辑封装
 */
public class ReflectClass {
    private final static String TAG = "peter.log.ReflectClass";

    /**
     * 创建对象
     */
    public static void reflectNewInstance() {
        try {
            Class<?> classBook = Class.forName("com.isyxf.refles.test.Book");
            Object objectBook = classBook.newInstance();
            Book book = (Book)objectBook;

            book.setName("前端进阶之光");
            book.setAuthor("Y.jer");

            System.out.println(TAG + "reflectNewInstance book = " + book.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * 反射私有的构造方法
     */
    public static void reflectPrivateConstructor() {
        try {
            Class<?> classBook = Class.forName("com.isyxf.refles.test.Book");
            Constructor<?> declaredConstrucorBook = classBook.getDeclaredConstructor(String.class, String.class);
            declaredConstrucorBook.setAccessible(true);
            Object objectBook = declaredConstrucorBook.newInstance("前端进阶之光", "Y.jer");

            Book book = (Book) objectBook;

            System.out.println(TAG + "reflectPrivateConstructor book = " + book.toString());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * 反射私有属性
     */
    public static void reflectPrivateField() {
        try {
            Class<?> classBook = Class.forName("com.isyxf.refles.test.Book");
            Object objectBook = classBook.newInstance();
            Field fieldTag = classBook.getDeclaredField("TAG");

            fieldTag.setAccessible(true);
            String tag = (String) fieldTag.get(objectBook);

            System.out.println(TAG + "reflectPrivateField tag = " + tag);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /**
     * 反射私有方法
     */
    public static void reflectPrivateMethod() {
        try {
            Class<?> classBook = Class.forName("com.isyxf.refles.test.Book");
            Method methodBook = classBook.getDeclaredMethod("declaredMethod", int.class);
            methodBook.setAccessible(true);

            Object objectBook = classBook.newInstance();
            String string = (String) methodBook.invoke(objectBook, 0);

            System.out.println(TAG + "reflectPrivateMethod string = " + string);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
