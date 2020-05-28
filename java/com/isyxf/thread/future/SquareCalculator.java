package com.isyxf.thread.future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author xiaofei.yan
 * @Create 2020-04-03 17:48
 * @Descript 233
 */
public class SquareCalculator {
    private ExecutorService executorService = Executors.newCachedThreadPool();

    public Future<Integer> calculate(Integer input) {
        Aaa aaa = new Aaa();


        aaa.run();
        return executorService.submit(() -> {
            Thread.sleep(1000);
            return input * input;
        });
    }

    class Aaa implements Runnable {
        @Override
        public void run() {
            System.out.println("2333afd");
        }
    }
}
