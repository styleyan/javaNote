package com.isyxf.test.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoOne {

    public static void main(String[] args) {
        int result = test();

        System.out.println(result);
    }

    public static int test() {
        Scanner input = new Scanner(System.in);
        try {
            int one = input.nextInt();
            int two = input.nextInt();

            return one/two;
        } catch (ArithmeticException e) {
            System.out.println("除数不允许为0");
            return 0;
        }finally {
            System.out.println("运算结束");
        }
    };
}
