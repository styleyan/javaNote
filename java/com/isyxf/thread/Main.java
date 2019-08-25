package com.isyxf.thread;

import java.rmi.server.ExportException;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author xiaofei.yan
 * @Create Time: 2019-07-17 10:30
 * @Descript 入口文件
 */
public class Main {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int ii = runtime.availableProcessors();
        System.out.println(ii);

        Object ccc = null;

        try {
            if (ccc == null) {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Process process = runtime.exec("mkdir");
            process.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
