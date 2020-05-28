package com.isyxf.thread.interrupt;

/**
 * @author xiaofei.yan
 * @Create 2020-04-02 13:54
 * @Descript 优先级
 */
public class ThreadPriority extends Thread {
    public ThreadPriority(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("" + Thread.currentThread().getName() + ",number:" + i + ",Priority:" + Thread.currentThread().getPriority());
        }
    }
}
