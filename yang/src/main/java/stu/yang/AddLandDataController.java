package stu.yang;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 地质主表信息
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2020/9/20 9:51 下午
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
