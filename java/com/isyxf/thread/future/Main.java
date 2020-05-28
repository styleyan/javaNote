package com.isyxf.thread.future;

import java.util.concurrent.Future;

/**
 * @author xiaofei.yan
 * @Create 2020-04-03 17:48
 * @Descript 测试
 */
public class Main {
    public static void main(String[] args) {
        SquareCalculator squareCalculator = new SquareCalculator();

        Future<Integer> fu = squareCalculator.calculate(233);
        System.out.println(fu);
    }
}
