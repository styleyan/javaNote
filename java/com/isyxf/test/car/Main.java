package com.isyxf.test.car;

public class Main {
    public static void main(String[] args) {
        Result result = null;

        result = new Result();

        Ccs ccs = new Ccs();

        ccs.run();


        result.run();

        result.cc();

        result.back();

        result.fly();

        result.sim();
    }
}
