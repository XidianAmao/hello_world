package com.amao.guava;

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

    @RequestMapping("/ask")
    public String getResult(String say){
        return appService.say();
    }
}
