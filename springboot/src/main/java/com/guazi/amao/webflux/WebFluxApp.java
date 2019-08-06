package com.guazi.amao.webflux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

/**
 * webflux采用的是非阻塞式web框架，基于java8，spring5
 *
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-08-06 20:15
 */
@RestController
@EnableAutoConfiguration
public class WebFluxApp {
    @Autowired
    private EchoHandler echoHandler;

    @GetMapping("echo")
    @Bean
    public RouterFunction<ServerResponse> echoRouterFunction() {
        return RouterFunctions.route(GET("/echo"), echoHandler::echo);
    }

    @EventListener(WebServerInitializedEvent.class)
    public void onWebServerReady(WebServerInitializedEvent event) {
        System.out.println("当前 webserver 实现类" + event.getWebServer().getClass().getName());
    }
}
