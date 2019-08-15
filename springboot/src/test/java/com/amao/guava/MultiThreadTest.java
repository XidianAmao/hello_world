package com.amao.guava;

import com.App;
import com.spring.mutlithread.MultiThreadService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * junit不支持多线程！！！
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-08-15 11:54
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = {App.class})
//@SpringBootTest(classes = {App.class})
public class MultiThreadTest {
    @Resource
    private MultiThreadService multiThreadService;

    @Test
    public void testWriteReadLock() {
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
