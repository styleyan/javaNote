package com.isyxf.testThread;

/**
 * @author xiaofei.yan
 * @Create 2020-04-01 16:39
 * @Descript 测试demo2
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
