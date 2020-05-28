package com.isyxf.thread.test;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author xiaofei.yan
 * @Create 2020-04-08 20:27
 * @Descript 实现线程拒绝策略
 */
public class RejectedExecutionHandlerImpl implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        if (executor.getActiveCount() > executor.getMaximumPoolSize()) {
            executor.remove(r);
        }
    }
}
