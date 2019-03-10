package com.isyxf.test.test;

public class HotelAgeException extends Exception {
    public HotelAgeException() {
        super("18岁以下，80岁以上需由亲友陪同");
    }
}
