package com.amao.guava.webflux;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;

/**
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-08-06 21:07
 */
@Component
public class EchoHandler {
    public Mono<ServerResponse> echo(ServerRequest request) {
        return ServerResponse.ok().body(fromObject(request.queryParam("name")));
    }
}
