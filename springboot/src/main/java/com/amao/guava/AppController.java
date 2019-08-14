package com.amao.guava;

import com.amao.guava.design.ConcreteClazz1;
import com.amao.guava.design.ConcreteClazz2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-08-08 20:43
 */
@RestController
public class AppController {
    @Resource
    private AppService appService;
    @Resource
    private ConcreteClazz1 concreteClazz1;
    @Resource
    private ConcreteClazz2 concreteClazz2;

    @RequestMapping("/ask")
    public String getResult(String say){
        return appService.say();
    }

    @RequestMapping("/c1")
    public void getC1Result(){
        concreteClazz1.sayByChildren();
    }

    @RequestMapping("/c2")
    public void getC2Result(){
        concreteClazz2.sayByChildren();
        concreteClazz2.execute();
    }
}
