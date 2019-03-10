package com.isyxf.test.tmp;

public class Main {
    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>(1, 2);
        Integer fist = pair.getFirst();
        Integer last = pair.getLast();

        System.out.println(fist);
        System.out.println(last);

        System.out.println(pair.toString());
    }
}
