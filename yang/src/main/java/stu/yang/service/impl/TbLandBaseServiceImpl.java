package stu.yang.service.impl;

import org.springframework.stereotype.Service;
import stu.yang.dao.TbLandMapper;
import stu.yang.domain.PagedListResponse;
import stu.yang.domain.TbLandQuery;
import stu.yang.entity.TbLand;
import stu.yang.service.TbLandBaseService;
import stu.yang.util.ResponseUtil;

import javax.annotation.Resource;
import java.util.List;


@Service("tbLandBaseService")
public class TbLandBaseServiceImpl implements TbLandBaseService {

    @Resource
    private TbLandMapper tbLandMapper;


    /**
     * {@inheritDoc}
     */
	@Override
    public boolean insert(final List<TbLand> tbLandList) {
        boolean resultFlag = false;
        if (null != tbLandList && tbLandList.size() > 0) {
            for (TbLand tbLand : tbLandList) {
                resultFlag = tbLandMapper.insert(tbLand);
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
    public boolean insert(TbLand tbLand) {
        return tbLandMapper.insert(tbLand);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean update(final TbLand tbLand) {
        return tbLandMapper.update(tbLand);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public List<TbLand> queryTbLandList(TbLandQuery queryBean) {
        return tbLandMapper.queryTbLandList(queryBean);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public PagedListResponse<TbLand> queryTbLandListWithPage(TbLandQuery queryBean) {
        if (null == queryBean) {
            queryBean = new TbLandQuery();
        }
        // 查询总数
        Integer totalCount = tbLandMapper.queryTbLandCount(queryBean);
        List<TbLand> tbLandList = tbLandMapper.queryTbLandListWithPage(queryBean);
        return ResponseUtil.getPagedResultListResponse(totalCount,queryBean.getPageSize(),queryBean.getCurrentPage(),tbLandList);
    }


    /**
     * {@inheritDoc}
     */
	@Override
    public int queryTbLandCount(TbLandQuery queryBean) {
        return tbLandMapper.queryTbLandCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean delete(TbLand tbLand) {
        return tbLandMapper.delete(tbLand);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public TbLand getTbLandById(Long id) {
        return tbLandMapper.getTbLandById(id);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean delete(final TbLand[] tbLands) {
        boolean resultFlag = false;
        if (null != tbLands && tbLands.length > 0) {
            for (int i = 0; i < tbLands.length; i++) {
                resultFlag = delete(tbLands[i]);
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
    public boolean exist(TbLand tbLand) {
        return tbLandMapper.exist(tbLand) > 0;
    }

}
