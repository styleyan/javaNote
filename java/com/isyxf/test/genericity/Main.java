package com.isyxf.test.genericity;

public class Main {
    public static void main(String[] args) {
        Box<Apple> box = new Box<Apple>();

        box.set(new Apple());

        Apple apple = box.get();

    }
}
