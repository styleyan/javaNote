package com.isyxf.thread.interrupt;

/**
 * @author xiaofei.yan
 * @Descript 继承线程
 */
public class InterruptThread extends Thread {
    public InterruptThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程开始");

        try {
            for (int i = 0; i < 1000; i++) {
                Thread.sleep(0);
                System.out.println("" + (i + 1));
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "线程捕获异常，退出循环");
            e.printStackTrace();
            return;
        }

        System.out.println(Thread.currentThread().getName() + "线程结束");
    }
}
