package stu.yang.service.impl;

import org.springframework.stereotype.Service;
import stu.yang.dao.TbAttachmentMapper;
import stu.yang.domain.PagedListResponse;
import stu.yang.domain.TbAttachmentQuery;
import stu.yang.entity.TbAttachment;
import stu.yang.service.TbAttachmentBaseService;
import stu.yang.util.ResponseUtil;

import javax.annotation.Resource;
import java.util.List;


@Service("tbAttachmentBaseService")
public class TbAttachmentBaseServiceImpl implements TbAttachmentBaseService {

    @Resource
    private TbAttachmentMapper tbAttachmentMapper;


    /**
     * {@inheritDoc}
     */
	@Override
    public boolean insert(final List<TbAttachment> tbAttachmentList) {
        boolean resultFlag = false;
        if (null != tbAttachmentList && tbAttachmentList.size() > 0) {
            for (TbAttachment tbAttachment : tbAttachmentList) {
//				tbAttachment.setYn(1);
                resultFlag = tbAttachmentMapper.insert(tbAttachment);
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
    public boolean insert(TbAttachment tbAttachment) {
        return tbAttachmentMapper.insert(tbAttachment);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean update(final TbAttachment tbAttachment) {
        return tbAttachmentMapper.update(tbAttachment);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public List<TbAttachment> queryTbAttachmentList(TbAttachmentQuery queryBean) {
        return tbAttachmentMapper.queryTbAttachmentList(queryBean);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public PagedListResponse<TbAttachment> queryTbAttachmentListWithPage(TbAttachmentQuery queryBean) {
        if (null == queryBean) {
            queryBean = new TbAttachmentQuery();
        }
        // 查询总数
        Integer totalCount = tbAttachmentMapper.queryTbAttachmentCount(queryBean);
        List<TbAttachment> tbAttachmentList = tbAttachmentMapper.queryTbAttachmentListWithPage(queryBean);
        return ResponseUtil.getPagedResultListResponse(totalCount,queryBean.getPageSize(),queryBean.getCurrentPage(),tbAttachmentList);
    }


    /**
     * {@inheritDoc}
     */
	@Override
    public int queryTbAttachmentCount(TbAttachmentQuery queryBean) {
        return tbAttachmentMapper.queryTbAttachmentCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean delete(TbAttachment tbAttachment) {
        return tbAttachmentMapper.delete(tbAttachment);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public TbAttachment getTbAttachmentById(Long id) {
        return tbAttachmentMapper.getTbAttachmentById(id);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean delete(final TbAttachment[] tbAttachments) {
        boolean resultFlag = false;
        if (null != tbAttachments && tbAttachments.length > 0) {
            for (int i = 0; i < tbAttachments.length; i++) {
                resultFlag = delete(tbAttachments[i]);
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
    public boolean exist(TbAttachment tbAttachment) {
        return tbAttachmentMapper.exist(tbAttachment) > 0;
    }

}
