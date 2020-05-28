package com.isyxf.testThread;

/**
 * @author xiaofei.yan
 * @Create 2020-04-01 16:27
 * @Descript 线程创建demo1
 */

public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();

        // 该方法调用多次，出现 java.lang.IllegalThreadStateException
        thread.start();
    }
}
