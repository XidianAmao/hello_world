package stu.yang.service.impl;

import org.springframework.stereotype.Service;
import stu.yang.dao.TbConstructionInteractionMapper;
import stu.yang.domain.PagedListResponse;
import stu.yang.domain.TbConstructionInteractionQuery;
import stu.yang.entity.TbConstructionInteraction;
import stu.yang.service.TbConstructionInteractionBaseService;
import stu.yang.util.ResponseUtil;

import javax.annotation.Resource;
import java.util.List;


@Service("tbConstructionInteractionBaseService")
public class TbConstructionInteractionBaseServiceImpl implements TbConstructionInteractionBaseService {

    @Resource
    private TbConstructionInteractionMapper tbConstructionInteractionMapper;


    /**
     * {@inheritDoc}
     */
	@Override
    public boolean insert(final List<TbConstructionInteraction> tbConstructionInteractionList) {
        boolean resultFlag = false;
        if (null != tbConstructionInteractionList && tbConstructionInteractionList.size() > 0) {
            for (TbConstructionInteraction tbConstructionInteraction : tbConstructionInteractionList) {
                resultFlag = tbConstructionInteractionMapper.insert(tbConstructionInteraction);
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
    public boolean insert(TbConstructionInteraction tbConstructionInteraction) {
        return tbConstructionInteractionMapper.insert(tbConstructionInteraction);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean update(final TbConstructionInteraction tbConstructionInteraction) {
        return tbConstructionInteractionMapper.update(tbConstructionInteraction);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public List<TbConstructionInteraction> queryTbConstructionInteractionList(TbConstructionInteractionQuery queryBean) {
        return tbConstructionInteractionMapper.queryTbConstructionInteractionList(queryBean);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public PagedListResponse<TbConstructionInteraction> queryTbConstructionInteractionListWithPage(TbConstructionInteractionQuery queryBean) {
        if (null == queryBean) {
            queryBean = new TbConstructionInteractionQuery();
        }
        // 查询总数
        Integer totalCount = tbConstructionInteractionMapper.queryTbConstructionInteractionCount(queryBean);
        List<TbConstructionInteraction> tbConstructionInteractionList = tbConstructionInteractionMapper.queryTbConstructionInteractionListWithPage(queryBean);
        return ResponseUtil.getPagedResultListResponse(totalCount,queryBean.getPageSize(),queryBean.getCurrentPage(),tbConstructionInteractionList);
    }


    /**
     * {@inheritDoc}
     */
	@Override
    public int queryTbConstructionInteractionCount(TbConstructionInteractionQuery queryBean) {
        return tbConstructionInteractionMapper.queryTbConstructionInteractionCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean delete(TbConstructionInteraction tbConstructionInteraction) {
        return tbConstructionInteractionMapper.delete(tbConstructionInteraction);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public TbConstructionInteraction getTbConstructionInteractionById(Long id) {
        return tbConstructionInteractionMapper.getTbConstructionInteractionById(id);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean delete(final TbConstructionInteraction[] tbConstructionInteractions) {
        boolean resultFlag = false;
        if (null != tbConstructionInteractions && tbConstructionInteractions.length > 0) {
            for (int i = 0; i < tbConstructionInteractions.length; i++) {
                resultFlag = delete(tbConstructionInteractions[i]);
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
    public boolean exist(TbConstructionInteraction tbConstructionInteraction) {
        return tbConstructionInteractionMapper.exist(tbConstructionInteraction) > 0;
    }

}
