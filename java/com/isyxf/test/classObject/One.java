package com.isyxf.test.classObject;

public class One extends Two implements Inters {

    static String st = "常来";

    private String a = "";

    private Integer n = 22;
    public String cc() {
        System.out.println("cccc===========eeeee");
        return "test";
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public void firstOne() {

    }

    @Override
    public void cf() {
        System.out.println("cf");
    }

    @Override
    public String twoA() {
        return null;
    }

    @Override
    void three(String c) {

    }

    @Override
    void sayName() {

    }
}
