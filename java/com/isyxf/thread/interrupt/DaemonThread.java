package com.isyxf.thread.interrupt;

/**
 * @author xiaofei.yan
 * @Create 2020-04-02 14:18
 * @Descript 守护线程
 */
public class DaemonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("DaemonThread 正在运行!");
        }
    }
}
