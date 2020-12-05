package stu.yang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import stu.yang.service.LandService;

import javax.annotation.Resource;
import java.util.Map;

/**
 * HTTP接口接收系统请求
 */
@RestController
public class LandController {
    @Resource
    private LandService landService;

    @GetMapping("/queryLandList")
    public Flux<Map<String,Object>> queryLandList(){
        return Flux.fromIterable(landService.queryLandList());
    }

    @GetMapping("/queryStratumByLandNo")
    public Mono<Map<String, Object>> queryStratumByLandNo(String landNo) {
        return Mono.justOrEmpty(landService.queryStratumByLandNo(landNo));
    }

    @GetMapping("/queryTerrainByLandNo")
    public Mono<Map<String, Object>> queryTerrainByLandNo(String landNo) {
        return Mono.justOrEmpty(landService.queryTerrainByLandNo(landNo));
    }

    @GetMapping("/queryConstructionInteractionByLandNo")
    public Mono<Map<String, Object>> queryConstructionInteractionByLandNo(String landNo) {
        return Mono.justOrEmpty(landService.queryConstructionInteractionByLandNo(landNo));
    }
}
