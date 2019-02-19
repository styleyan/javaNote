package com.isyxf.test.fn;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        Po po = new Po();

        List list = new ArrayList<>();

        list.add(car);
        list.add(po);

        System.out.println(list.size());
    }
}
