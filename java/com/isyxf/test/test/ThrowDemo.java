package com.isyxf.test.test;

import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            testAge();
        } catch (HotelAgeException e) {
            System.out.println(e.getMessage());
            System.out.println("酒店前台工作人员不允许办理入住登记");
        } catch (Exception e) {
            System.out.println("不允许输入非数字");
        }
    }

    /**
     * 描述酒店的入住规则，限定年 18岁以下，80岁以上需由亲友陪同
     */
//    public static void testAge() {
//        try {
//            System.out.println("请输入年龄:");
//            Scanner input = new Scanner(System.in);
//
//            int age = input.nextInt();
//            int MIN_AGE = 18;
//            int MAX_AGE = 80;
//
//            if (age < MIN_AGE || age > MAX_AGE) {
//                throw new Exception("18岁以下，80岁以上需由亲友陪同");
//            } else {
//                System.out.println("欢迎入住");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static void testAge() throws HotelAgeException {
        System.out.println("请输入年龄:");
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();
        int MIN_AGE = 18;
        int MAX_AGE = 80;

        if (age < MIN_AGE || age > MAX_AGE) {
            throw new HotelAgeException();
        } else {
            System.out.println("欢迎入住");
        }
    }
}
