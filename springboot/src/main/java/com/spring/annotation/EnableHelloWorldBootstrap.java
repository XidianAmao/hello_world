package com.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-08-19 19:58
 */
@EnableHelloWorld
@Configuration
public class EnableHelloWorldBootstrap {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(EnableHelloWorldBootstrap.class);
        context.refresh();
        String helloWorld = context.getBean("hello", String.class);
        System.out.println(helloWorld);
        context.close();
    }
}
