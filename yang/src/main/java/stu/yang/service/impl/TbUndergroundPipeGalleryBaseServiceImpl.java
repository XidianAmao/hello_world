package stu.yang.service.impl;

import org.springframework.stereotype.Service;
import stu.yang.dao.TbUndergroundPipeGalleryMapper;
import stu.yang.domain.PagedListResponse;
import stu.yang.domain.TbUndergroundPipeGalleryQuery;
import stu.yang.entity.TbUndergroundPipeGallery;
import stu.yang.service.TbUndergroundPipeGalleryBaseService;
import stu.yang.util.ResponseUtil;

import javax.annotation.Resource;
import java.util.List;


@Service("tbUndergroundPipeGalleryBaseService")
public class TbUndergroundPipeGalleryBaseServiceImpl implements TbUndergroundPipeGalleryBaseService {

    @Resource
    private TbUndergroundPipeGalleryMapper tbUndergroundPipeGalleryMapper;


    /**
     * {@inheritDoc}
     */
	@Override
    public boolean insert(final List<TbUndergroundPipeGallery> tbUndergroundPipeGalleryList) {
        boolean resultFlag = false;
        if (null != tbUndergroundPipeGalleryList && tbUndergroundPipeGalleryList.size() > 0) {
            for (TbUndergroundPipeGallery tbUndergroundPipeGallery : tbUndergroundPipeGalleryList) {
                resultFlag = tbUndergroundPipeGalleryMapper.insert(tbUndergroundPipeGallery);
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
    public boolean insert(TbUndergroundPipeGallery tbUndergroundPipeGallery) {
        return tbUndergroundPipeGalleryMapper.insert(tbUndergroundPipeGallery);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean update(final TbUndergroundPipeGallery tbUndergroundPipeGallery) {
        return tbUndergroundPipeGalleryMapper.update(tbUndergroundPipeGallery);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public List<TbUndergroundPipeGallery> queryTbUndergroundPipeGalleryList(TbUndergroundPipeGalleryQuery queryBean) {
        return tbUndergroundPipeGalleryMapper.queryTbUndergroundPipeGalleryList(queryBean);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public PagedListResponse<TbUndergroundPipeGallery> queryTbUndergroundPipeGalleryListWithPage(TbUndergroundPipeGalleryQuery queryBean) {
        if (null == queryBean) {
            queryBean = new TbUndergroundPipeGalleryQuery();
        }
        // 查询总数
        Integer totalCount = tbUndergroundPipeGalleryMapper.queryTbUndergroundPipeGalleryCount(queryBean);
        List<TbUndergroundPipeGallery> tbUndergroundPipeGalleryList = tbUndergroundPipeGalleryMapper.queryTbUndergroundPipeGalleryListWithPage(queryBean);
        return ResponseUtil.getPagedResultListResponse(totalCount,queryBean.getPageSize(),queryBean.getCurrentPage(),tbUndergroundPipeGalleryList);
    }


    /**
     * {@inheritDoc}
     */
	@Override
    public int queryTbUndergroundPipeGalleryCount(TbUndergroundPipeGalleryQuery queryBean) {
        return tbUndergroundPipeGalleryMapper.queryTbUndergroundPipeGalleryCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean delete(TbUndergroundPipeGallery tbUndergroundPipeGallery) {
        return tbUndergroundPipeGalleryMapper.delete(tbUndergroundPipeGallery);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public TbUndergroundPipeGallery getTbUndergroundPipeGalleryById(Long id) {
        return tbUndergroundPipeGalleryMapper.getTbUndergroundPipeGalleryById(id);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean delete(final TbUndergroundPipeGallery[] tbUndergroundPipeGallerys) {
        boolean resultFlag = false;
        if (null != tbUndergroundPipeGallerys && tbUndergroundPipeGallerys.length > 0) {
            for (int i = 0; i < tbUndergroundPipeGallerys.length; i++) {
                resultFlag = delete(tbUndergroundPipeGallerys[i]);
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
    public boolean exist(TbUndergroundPipeGallery tbUndergroundPipeGallery) {
        return tbUndergroundPipeGalleryMapper.exist(tbUndergroundPipeGallery) > 0;
    }

}
