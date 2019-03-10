package com.isyxf.test.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsDemo {
    public static void main(String[] args) {
        try{
            int result = test();
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("错误异常了");
        } catch (InputMismatchException e) {
            System.out.println("请输入整数");
        }
    }
    /**
     * 异常处理
     * @return
     * @throws ArithmeticException
     * @throws InputMismatchException
     */
    public static int test() throws ArithmeticException, InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.println("============运算开始============");

        int one = input.nextInt();
        int two = input.nextInt();

        System.out.println("运算结束");

        return one/two;
    }
}
