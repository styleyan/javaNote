package com.isyxf.testThread;

/**
 * @author xiaofei.yan
 * @Create 2020-04-01 16:29
 * @Descript 我的测试线程
 */
class MyThread extends Thread{
    @Override
    public void run() {
        super.run();

        System.out.println("hellow_world");
    }
}
