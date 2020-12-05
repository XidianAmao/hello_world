package stu.yang.filter;

import com.alibaba.fastjson.JSON;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import stu.yang.domain.BaseResponse;
import stu.yang.handler.JwtToken;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.function.Consumer;

@Component
public class TokenFilter implements GlobalFilter, Ordered {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public int getOrder() {
        // 返回值用来指定执行的顺序，数字越小，优先级越高
        return 0;
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        ServerHttpRequest request = exchange.getRequest();

        //获取访问路劲
        String path = request.getPath().value();
        //校验是否是可以直接访问的路径，例如登录接口
        if (isPass(path)) {
            return chain.filter(exchange);
        }

        //从请求头中获取token
        String token = request.getHeaders().get( "token").get(0);

        //校验token
        DecodedJWT decodedJWT = null;
        try {
            decodedJWT = JwtToken.verifyToken(token);
        } catch (TokenExpiredException e) {
            return this.returnData(407, "登录状态已失效，请重新登录", exchange);
        } catch (Exception e) {
            log.info(e.getMessage(), e);
            return this.returnData(407, "您还未登录哟", exchange);
        }

        //获取token中解析出的userId
        String userId = decodedJWT.getClaims().get("user_id").asString();

        //将userId存入header
        Consumer<HttpHeaders> httpHeaders = httpHeader -> {
            httpHeader.set("user_id", userId);
        };
        ServerHttpRequest serverHttpRequest = request.mutate().headers(httpHeaders).build();
        exchange.mutate().request(serverHttpRequest).build();

        return chain.filter(exchange);
    }

    /**
     * 校验不需要token可以直接访问的路径
     */
    private boolean isPass(String path) {
        HashSet<String> paths = new HashSet<>();
        //这里可以设置不用token可以访问的路径
        paths.add("/account-service/auth/token");
        return paths.contains(path) ? true : false;
    }


    /**
     * 返回值的封装
     */
    private Mono<Void> returnData(Integer code, String msg, ServerWebExchange exchange) {
        ServerHttpResponse response = exchange.getResponse();

        BaseResponse<Object> data = new BaseResponse<>(code, msg);

        byte[] datas = JSON.toJSONString(data).getBytes(StandardCharsets.UTF_8);
        DataBuffer buffer = response.bufferFactory().wrap(datas);

        response.setStatusCode(HttpStatus.OK);
        response.getHeaders().add("Content-Type", "application/json;charset=UTF-8");

        return response.writeWith(Mono.just(buffer));
    }

}