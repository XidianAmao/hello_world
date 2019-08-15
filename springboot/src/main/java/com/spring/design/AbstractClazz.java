package com.spring.design;

import com.amao.guava.AppService;

import javax.annotation.Resource;

/**
 * https://www.cnblogs.com/wangkaihua/p/9123171.html
 * https://blog.csdn.net/m0_37542889/article/details/83014385
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-08-13 21:17
 */
public abstract class AbstractClazz {
    @Resource
    private AppService appService;

    public void execute(){
        appService.say();
        System.out.println("我是抽象类");
        System.out.println(appService.say());
    }
}
