package com.spring.mutlithread;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-08-15 14:07
 */
@Service
public class MultiThreadMain {

    @Resource
    private MultiThreadService multiThreadService;

    public void main() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 3; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 3; j++) {
                        multiThreadService.put(new Object());//写操作
                    }
                }
            });
        }

        for (int i = 0; i < 3; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 3; j++) {
                        multiThreadService.get();//多个线程读取操作
                    }
                }
            });
        }

        executorService.shutdown();
    }
}
