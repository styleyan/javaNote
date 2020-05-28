package com.isyxf.testThread;

/**
 * @author xiaofei.yan
 * @Create 2020-04-01 16:37
 * @Descript Runnable接口
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("通过 Runnable 创建的线程");
    }
}
