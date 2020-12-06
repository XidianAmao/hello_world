package stu.yang.service.impl;

import org.springframework.stereotype.Service;
import stu.yang.dao.TbStratumMapper;
import stu.yang.domain.PagedListResponse;
import stu.yang.domain.TbStratumQuery;
import stu.yang.entity.TbStratum;
import stu.yang.service.TbStratumBaseService;
import stu.yang.util.ResponseUtil;

import javax.annotation.Resource;
import java.util.List;


@Service("tbStratumBaseService")
public class TbStratumBaseServiceImpl implements TbStratumBaseService {

    @Resource
    private TbStratumMapper tbStratumMapper;


    /**
     * {@inheritDoc}
     */
	@Override
    public boolean insert(final List<TbStratum> tbStratumList) {
        boolean resultFlag = false;
        if (null != tbStratumList && tbStratumList.size() > 0) {
            for (TbStratum tbStratum : tbStratumList) {
                resultFlag = tbStratumMapper.insert(tbStratum);
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
    public boolean insert(TbStratum tbStratum) {
        return tbStratumMapper.insert(tbStratum);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean update(final TbStratum tbStratum) {
        return tbStratumMapper.update(tbStratum);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public List<TbStratum> queryTbStratumList(TbStratumQuery queryBean) {
        return tbStratumMapper.queryTbStratumList(queryBean);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public PagedListResponse<TbStratum> queryTbStratumListWithPage(TbStratumQuery queryBean) {
        if (null == queryBean) {
            queryBean = new TbStratumQuery();
        }
        // 查询总数
        Integer totalCount = tbStratumMapper.queryTbStratumCount(queryBean);
        List<TbStratum> tbStratumList = tbStratumMapper.queryTbStratumListWithPage(queryBean);
        return ResponseUtil.getPagedResultListResponse(totalCount,queryBean.getPageSize(),queryBean.getCurrentPage(),tbStratumList);
    }


    /**
     * {@inheritDoc}
     */
	@Override
    public int queryTbStratumCount(TbStratumQuery queryBean) {
        return tbStratumMapper.queryTbStratumCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean delete(TbStratum tbStratum) {
        return tbStratumMapper.delete(tbStratum);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public TbStratum getTbStratumById(Long id) {
        return tbStratumMapper.getTbStratumById(id);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean delete(final TbStratum[] tbStratums) {
        boolean resultFlag = false;
        if (null != tbStratums && tbStratums.length > 0) {
            for (int i = 0; i < tbStratums.length; i++) {
                resultFlag = delete(tbStratums[i]);
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
    public boolean exist(TbStratum tbStratum) {
        return tbStratumMapper.exist(tbStratum) > 0;
    }

}
