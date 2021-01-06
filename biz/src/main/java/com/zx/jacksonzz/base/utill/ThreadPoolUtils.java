package com.zx.jacksonzz.base.utill;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @program: ThreadPoolUtils
 * @description:
 * @author: zhou zhi
 * @create: 2021-01-06 18:04
 */
@Slf4j
public class ThreadPoolUtils {
    private ThreadPoolUtils() {
    }

    private static final ExecutorService THREAD_POOL = new ThreadPoolExecutor(10, 100, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new ThreadFactoryBuilder().setNameFormat("thread-pool-%d").build());

    public static ExecutorService getPool() {
        return THREAD_POOL;
    }
}
