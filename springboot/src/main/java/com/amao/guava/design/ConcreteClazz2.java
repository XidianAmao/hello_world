package com.amao.guava.design;

import com.amao.guava.AppService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-08-13 21:20
 */
@Service
public class ConcreteClazz2 extends AbstractClazz {
    @Resource
    private AppService appService;

    public void sayByChildren(){
        System.out.println("我是具体类2");
        appService.say();
    }
}
