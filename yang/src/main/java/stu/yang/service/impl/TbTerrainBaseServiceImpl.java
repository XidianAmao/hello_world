package stu.yang.service.impl;

import org.springframework.stereotype.Service;
import stu.yang.dao.TbTerrainMapper;
import stu.yang.domain.PagedListResponse;
import stu.yang.domain.TbTerrainQuery;
import stu.yang.entity.TbTerrain;
import stu.yang.service.TbTerrainBaseService;
import stu.yang.util.ResponseUtil;

import javax.annotation.Resource;
import java.util.List;

@Service("tbTerrainBaseService")
public class TbTerrainBaseServiceImpl implements TbTerrainBaseService {

    @Resource
    private TbTerrainMapper tbTerrainMapper;


    /**
     * {@inheritDoc}
     */
	@Override
    public boolean insert(final List<TbTerrain> tbTerrainList) {
        boolean resultFlag = false;
        if (null != tbTerrainList && tbTerrainList.size() > 0) {
            for (TbTerrain tbTerrain : tbTerrainList) {
                resultFlag = tbTerrainMapper.insert(tbTerrain);
                if (!resultFlag) {
                    throw new RuntimeException("批量新增表信息异常");
                }
            }
        }

        return resultFlag;
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean insert(TbTerrain tbTerrain) {
        return tbTerrainMapper.insert(tbTerrain);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean update(final TbTerrain tbTerrain) {
        return tbTerrainMapper.update(tbTerrain);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public List<TbTerrain> queryTbTerrainList(TbTerrainQuery queryBean) {
        return tbTerrainMapper.queryTbTerrainList(queryBean);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public PagedListResponse<TbTerrain> queryTbTerrainListWithPage(TbTerrainQuery queryBean) {
        if (null == queryBean) {
            queryBean = new TbTerrainQuery();
        }
        // 查询总数
        Integer totalCount = tbTerrainMapper.queryTbTerrainCount(queryBean);
        List<TbTerrain> tbTerrainList = tbTerrainMapper.queryTbTerrainListWithPage(queryBean);
        return ResponseUtil.getPagedResultListResponse(totalCount,queryBean.getPageSize(),queryBean.getCurrentPage(),tbTerrainList);
    }


    /**
     * {@inheritDoc}
     */
	@Override
    public int queryTbTerrainCount(TbTerrainQuery queryBean) {
        return tbTerrainMapper.queryTbTerrainCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean delete(TbTerrain tbTerrain) {
        return tbTerrainMapper.delete(tbTerrain);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public TbTerrain getTbTerrainById(Long id) {
        return tbTerrainMapper.getTbTerrainById(id);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean delete(final TbTerrain[] tbTerrains) {
        boolean resultFlag = false;
        if (null != tbTerrains && tbTerrains.length > 0) {
            for (int i = 0; i < tbTerrains.length; i++) {
                resultFlag = delete(tbTerrains[i]);
                if (!resultFlag) {
                    throw new RuntimeException("批量删除表信息异常!");
                }
            }
        }

        return resultFlag;
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean exist(TbTerrain tbTerrain) {
        return tbTerrainMapper.exist(tbTerrain) > 0;
    }

}
