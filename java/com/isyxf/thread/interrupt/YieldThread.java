package com.isyxf.thread.interrupt;

/**
 * @author xiaofei.yan
 * @Create 2020-04-02 14:26
 * @Descript 线程让步
 */
public class YieldThread extends Thread {
    @Override
    public void run() {
        long time_start = System.currentTimeMillis();


        for(int i = 0; i < 50000; i++) {
            Math.random();
            Thread.yield();
        }

        long time_end = System.currentTimeMillis();
        System.out.println("用时:" + (time_end - time_start));
    }
}
