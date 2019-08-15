package com.amao.guava;

import com.google.common.base.Stopwatch;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * https://blog.csdn.net/xiang__liu/article/details/81147933
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-08-08 20:48
 */
public class AppControllerTest {

    @Test
    public void getResult() {
        try {
            Stopwatch timer = Stopwatch.createStarted();
            Thread.sleep(2000l);
            System.out.println(timer.elapsed(TimeUnit.SECONDS));
            Thread.sleep(2000l);
            System.out.println(timer.elapsed(TimeUnit.SECONDS));
        } catch (Exception e){

        }
    }
}