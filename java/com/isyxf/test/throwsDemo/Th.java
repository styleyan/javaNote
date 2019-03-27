package com.isyxf.test.throwsDemo;

public class Th {
    public void divide(int one, int two) throws Exception {
        if (two == 0) {
            throw new Exception("两数相除，除数不能为0");
        } else {
            System.out.println("两数相除，结果为:" + (one/two));
        }
    }

    public static void main(String[] args) {
        Th th = new Th();
        try {
            th.divide(2, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
