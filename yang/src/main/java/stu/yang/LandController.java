package stu.yang;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2020/8/31 7:38 下午
 */
@RestController
public class LandController {
    @Resource
    private LandService landService;

    @GetMapping("/queryLandList")
    public Map<String,Object> queryLandList(){
        return landService.queryLandList();
    }

    @GetMapping("/queryStratumByLandNo")
    public Map<String, Object> queryStratumByLandNo(String landNo) {
        return landService.queryStratumByLandNo(landNo);
    }

    @GetMapping("/queryTerrainByLandNo")
    public Map<String, Object> queryTerrainByLandNo(String landNo) {
        return landService.queryTerrainByLandNo(landNo);
    }

    @GetMapping("/queryConstructionInteractionByLandNo")
    public Map<String, Object> queryConstructionInteractionByLandNo(String landNo) {
        return landService.queryConstructionInteractionByLandNo(landNo);
    }
}
