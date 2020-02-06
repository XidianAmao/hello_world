package com.spring.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.AbstractEnvironment;

/**
 * 根据配置条件装配远离
 * AnnotationConfigApplicationContext 注册bean Class
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-09-18 20:10
 */
@Configuration
@ComponentScan(basePackageClasses = CalculatingService.class)
public class CalculatingServiceBootstrap {
    static {
        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "Java8");
        System.setProperty(AbstractEnvironment.DEFAULT_PROFILES_PROPERTY_NAME, "Java7");
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(CalculatingServiceBootstrap.class);
        context.refresh();
        CalculatingService calculatingService = context.getBean(CalculatingService.class);
        calculatingService.sum(1, 2, 3, 4, 5);
        context.close();
    }
}
