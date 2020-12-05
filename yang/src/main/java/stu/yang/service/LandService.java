package stu.yang.service;

import org.springframework.stereotype.Service;
import stu.yang.dao.Dao;
import stu.yang.domain.Land;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 地上地下空间一体化信息
 */
@Service
public class LandService {
    @Resource
    private Dao dao;

    /**
     * 查询地块主表信息
     *
     * @return 地块主表列表信息
     */
    public List<Map<String, Object>> queryLandList() {
        return dao.queryLandList();
    }

    /**
     * 根据地块主表id查询地层信息
     *
     * @return 地层信息
     */
    public Map<String, Object> queryStratumByLandNo(String landNo) {
        return dao.queryStratumByLandNo(landNo);
    }

    /**
     * 根据地块主表id查询地形信息
     *
     * @return 地形信息
     */
    public Map<String, Object> queryTerrainByLandNo(String landNo) {
        return dao.queryTerrainByLandNo(landNo);
    }

    /**
     * 根据地块主表id查询施工交互信息
     *
     * @return 施工交互信息
     */
    public Map<String, Object> queryConstructionInteractionByLandNo(String landNo) {
        return dao.queryConstructionInteractionByLandNo(landNo);
    }

    /**
     * 新增地表主表信息
     */
    public boolean addLand(Land land) {
        return dao.insert(land) == 1;
    }
}
