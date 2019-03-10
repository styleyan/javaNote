package com.isyxf.test.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T e: list) {
            if(p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }

    public static <T> List<T> filter2(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();

        for (T e: list) {
            if (p.test(e)) {
                result.add(e);
            }
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
