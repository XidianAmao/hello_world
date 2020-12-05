package stu.yang.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import stu.yang.domain.Land;
import stu.yang.service.LandService;

import javax.annotation.Resource;

/**
 * 地质主表信息HTTP请求
 */
@RestController
public class AddLandDataController {
    @Resource
    private LandService landService;

    @PostMapping("/insertLand")
    public boolean insert(Land land) {
        return landService.addLand(land);
    }
}
