package stu.yang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.reactive.ServerHttpRequest;


public class BaseController {
    @Autowired
    protected ServerHttpRequest request;

    public String getUserId(){
        return request.getHeaders().get("userId").get(0);
    }

    public String getHeader(String key){
        return request.getHeaders().get(key).get(0);
    }
}
