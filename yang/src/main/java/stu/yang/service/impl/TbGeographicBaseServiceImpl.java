package stu.yang.service.impl;

import org.springframework.stereotype.Service;
import stu.yang.dao.TbGeographicMapper;
import stu.yang.domain.PagedListResponse;
import stu.yang.domain.TbGeographicQuery;
import stu.yang.entity.TbGeographic;
import stu.yang.service.TbGeographicBaseService;
import stu.yang.util.ResponseUtil;

import javax.annotation.Resource;
import java.util.List;

@Service("tbGeographicBaseService")
public class TbGeographicBaseServiceImpl implements TbGeographicBaseService {

    @Resource
    private TbGeographicMapper tbGeographicMapper;


    /**
     * {@inheritDoc}
     */
	@Override
    public boolean insert(final List<TbGeographic> tbGeographicList) {
        boolean resultFlag = false;
        if (null != tbGeographicList && tbGeographicList.size() > 0) {
            for (TbGeographic tbGeographic : tbGeographicList) {
                resultFlag = tbGeographicMapper.insert(tbGeographic);
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
    public boolean insert(TbGeographic tbGeographic) {
        return tbGeographicMapper.insert(tbGeographic);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean update(final TbGeographic tbGeographic) {
        return tbGeographicMapper.update(tbGeographic);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public List<TbGeographic> queryTbGeographicList(TbGeographicQuery queryBean) {
        return tbGeographicMapper.queryTbGeographicList(queryBean);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public PagedListResponse<TbGeographic> queryTbGeographicListWithPage(TbGeographicQuery queryBean) {
        if (null == queryBean) {
            queryBean = new TbGeographicQuery();
        }
        // 查询总数
        Integer totalCount = tbGeographicMapper.queryTbGeographicCount(queryBean);
        List<TbGeographic> tbGeographicList = tbGeographicMapper.queryTbGeographicListWithPage(queryBean);
        return ResponseUtil.getPagedResultListResponse(totalCount,queryBean.getPageSize(),queryBean.getCurrentPage(),tbGeographicList);
    }


    /**
     * {@inheritDoc}
     */
	@Override
    public int queryTbGeographicCount(TbGeographicQuery queryBean) {
        return tbGeographicMapper.queryTbGeographicCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean delete(TbGeographic tbGeographic) {
        return tbGeographicMapper.delete(tbGeographic);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public TbGeographic getTbGeographicById(Long id) {
        return tbGeographicMapper.getTbGeographicById(id);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean delete(final TbGeographic[] tbGeographics) {
        boolean resultFlag = false;
        if (null != tbGeographics && tbGeographics.length > 0) {
            for (int i = 0; i < tbGeographics.length; i++) {
                resultFlag = delete(tbGeographics[i]);
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
    public boolean exist(TbGeographic tbGeographic) {
        return tbGeographicMapper.exist(tbGeographic) > 0;
    }

}
