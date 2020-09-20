package stu.yang;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2020/9/20 4:56 下午
 */
@Component
public class Dao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    /**
     * 查询地块主表信息
     *
     * @return 地块主表列表信息
     */
    public Map<String, Object> queryLandList() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * FROM tb_land");
        return list.get(0);
    }

    /**
     * 根据地块主表id查询地层信息
     *
     * @return 地层信息
     */
    public Map<String, Object> queryStratumByLandNo(String landNo) {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * FROM tb_stratum where land_no = '" + landNo + "'");
        return list.get(0);
    }

    /**
     * 根据地块主表id查询地形信息
     *
     * @return 地形信息
     */
    public Map<String, Object> queryTerrainByLandNo(String landNo) {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * FROM tb_terrain where land_no = '" + landNo + "'");
        return list.get(0);
    }

    /**
     * 根据地块主表id查询施工交互信息
     *
     * @return 施工交互信息
     */
    public Map<String, Object> queryConstructionInteractionByLandNo(String landNo) {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * FROM tb_construction_interaction where land_no = '" + landNo + "'");
        return list.get(0);
    }

    /**
     * 维护主表信息
     * @param land 主表
     * @return 主表信息
     */
    public int insert(Land land) {
        String sql = "INSERT INTO `tb_land`(`land_no`, `city_no`, `land_property_no`, `land_property`, `land_area`, `land_address`, `created_user`) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, land.getLandNo(), land.getCityNo(), land.getLandPropertyNo(), land.getLandProperty(),
                land.getLandArea(), land.getLandAddress(), land.getCreatedUser());
    }
}
