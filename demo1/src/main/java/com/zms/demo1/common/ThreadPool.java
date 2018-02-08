package com.zms.demo1.common;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    //线程池
    public static ExecutorService pool;

    static {
      pool = Executors.newFixedThreadPool(5);
    };


}
