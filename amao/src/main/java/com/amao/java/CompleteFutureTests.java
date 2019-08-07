package com.amao.java;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * guava CompleteFuture
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-08-07 19:48
 */
public class CompleteFutureTests {
    private static ThreadPoolExecutor threadPoolExecutor =
            new ThreadPoolExecutor(5,5,0L, TimeUnit.SECONDS,
                    new ArrayBlockingQueue(50), new ThreadFactoryBuilder().setNameFormat("XX-task-%d").build(),
                    new ThreadPoolExecutor.DiscardPolicy());

    public static void main(String[] args) throws Exception {
        CompletableFuture<String> bookFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("000000000");
            return "xanyi000001";
        }, threadPoolExecutor);

        //2
        CompletableFuture<String> tableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("沉睡5秒");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "xanyi111110";
        }, threadPoolExecutor);

        CompletableFuture.allOf(bookFuture, tableFuture).join();
//        CompletableFuture.anyOf(bookFuture, tableFuture).join();

        System.out.println("book -> " + bookFuture.get());
        System.out.println("tale -> " + tableFuture.get());
    }
}
