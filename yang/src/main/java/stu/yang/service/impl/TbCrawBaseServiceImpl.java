package stu.yang.service.impl;

import org.springframework.stereotype.Service;
import stu.yang.dao.TbCrawMapper;
import stu.yang.domain.PagedListResponse;
import stu.yang.domain.TbCrawQuery;
import stu.yang.entity.TbCraw;
import stu.yang.service.TbCrawBaseService;
import stu.yang.util.ResponseUtil;

import javax.annotation.Resource;
import java.util.List;



@Service("tbCrawBaseService")
public class TbCrawBaseServiceImpl implements TbCrawBaseService {

    @Resource
    private TbCrawMapper tbCrawMapper;


    /**
     * {@inheritDoc}
     */
	@Override
    public boolean insert(final List<TbCraw> tbCrawList) {
        boolean resultFlag = false;
        if (null != tbCrawList && tbCrawList.size() > 0) {
            for (TbCraw tbCraw : tbCrawList) {
                resultFlag = tbCrawMapper.insert(tbCraw);
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
    public boolean insert(TbCraw tbCraw) {
        return tbCrawMapper.insert(tbCraw);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean update(final TbCraw tbCraw) {
        return tbCrawMapper.update(tbCraw);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public List<TbCraw> queryTbCrawList(TbCrawQuery queryBean) {
        return tbCrawMapper.queryTbCrawList(queryBean);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public PagedListResponse<TbCraw> queryTbCrawListWithPage(TbCrawQuery queryBean) {
        if (null == queryBean) {
            queryBean = new TbCrawQuery();
        }
        // 查询总数
        Integer totalCount = tbCrawMapper.queryTbCrawCount(queryBean);
        List<TbCraw> tbCrawList = tbCrawMapper.queryTbCrawListWithPage(queryBean);
        return ResponseUtil.getPagedResultListResponse(totalCount,queryBean.getPageSize(),queryBean.getCurrentPage(),tbCrawList);
    }


    /**
     * {@inheritDoc}
     */
	@Override
    public int queryTbCrawCount(TbCrawQuery queryBean) {
        return tbCrawMapper.queryTbCrawCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean delete(TbCraw tbCraw) {
        return tbCrawMapper.delete(tbCraw);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public TbCraw getTbCrawById(Long id) {
        return tbCrawMapper.getTbCrawById(id);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean delete(final TbCraw[] tbCraws) {
        boolean resultFlag = false;
        if (null != tbCraws && tbCraws.length > 0) {
            for (int i = 0; i < tbCraws.length; i++) {
                resultFlag = delete(tbCraws[i]);
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
    public boolean exist(TbCraw tbCraw) {
        return tbCrawMapper.exist(tbCraw) > 0;
    }

}
