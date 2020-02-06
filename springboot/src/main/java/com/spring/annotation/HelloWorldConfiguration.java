package com.spring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-08-19 19:54
 */
@Configuration
public class HelloWorldConfiguration {
    private Lock lock;
    @Bean
    public String hello(){
        return "Hello,World";
    }
}
