package stu.yang.service.impl;

import org.springframework.stereotype.Service;
import stu.yang.dao.TbUndergroundStructuresMapper;
import stu.yang.domain.PagedListResponse;
import stu.yang.domain.TbUndergroundStructuresQuery;
import stu.yang.entity.TbUndergroundStructures;
import stu.yang.service.TbUndergroundStructuresBaseService;
import stu.yang.util.ResponseUtil;

import javax.annotation.Resource;
import java.util.List;

@Service("tbUndergroundStructuresBaseService")
public class TbUndergroundStructuresBaseServiceImpl implements TbUndergroundStructuresBaseService {

    @Resource
    private TbUndergroundStructuresMapper tbUndergroundStructuresMapper;


    /**
     * {@inheritDoc}
     */
	@Override
    public boolean insert(final List<TbUndergroundStructures> tbUndergroundStructuresList) {
        boolean resultFlag = false;
        if (null != tbUndergroundStructuresList && tbUndergroundStructuresList.size() > 0) {
            for (TbUndergroundStructures tbUndergroundStructures : tbUndergroundStructuresList) {
                resultFlag = tbUndergroundStructuresMapper.insert(tbUndergroundStructures);
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
    public boolean insert(TbUndergroundStructures tbUndergroundStructures) {
        return tbUndergroundStructuresMapper.insert(tbUndergroundStructures);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean update(final TbUndergroundStructures tbUndergroundStructures) {
        return tbUndergroundStructuresMapper.update(tbUndergroundStructures);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public List<TbUndergroundStructures> queryTbUndergroundStructuresList(TbUndergroundStructuresQuery queryBean) {
        return tbUndergroundStructuresMapper.queryTbUndergroundStructuresList(queryBean);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public PagedListResponse<TbUndergroundStructures> queryTbUndergroundStructuresListWithPage(TbUndergroundStructuresQuery queryBean) {
        if (null == queryBean) {
            queryBean = new TbUndergroundStructuresQuery();
        }
        // 查询总数
        Integer totalCount = tbUndergroundStructuresMapper.queryTbUndergroundStructuresCount(queryBean);
        List<TbUndergroundStructures> tbUndergroundStructuresList = tbUndergroundStructuresMapper.queryTbUndergroundStructuresListWithPage(queryBean);
        return ResponseUtil.getPagedResultListResponse(totalCount,queryBean.getPageSize(),queryBean.getCurrentPage(),tbUndergroundStructuresList);
    }


    /**
     * {@inheritDoc}
     */
	@Override
    public int queryTbUndergroundStructuresCount(TbUndergroundStructuresQuery queryBean) {
        return tbUndergroundStructuresMapper.queryTbUndergroundStructuresCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean delete(TbUndergroundStructures tbUndergroundStructures) {
        return tbUndergroundStructuresMapper.delete(tbUndergroundStructures);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public TbUndergroundStructures getTbUndergroundStructuresById(Long id) {
        return tbUndergroundStructuresMapper.getTbUndergroundStructuresById(id);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean delete(final TbUndergroundStructures[] tbUndergroundStructuress) {
        boolean resultFlag = false;
        if (null != tbUndergroundStructuress && tbUndergroundStructuress.length > 0) {
            for (int i = 0; i < tbUndergroundStructuress.length; i++) {
                resultFlag = delete(tbUndergroundStructuress[i]);
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
    public boolean exist(TbUndergroundStructures tbUndergroundStructures) {
        return tbUndergroundStructuresMapper.exist(tbUndergroundStructures) > 0;
    }

}
