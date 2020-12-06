package stu.yang.service.impl;

import org.springframework.stereotype.Service;
import stu.yang.dao.TbUserMapper;
import stu.yang.domain.PagedListResponse;
import stu.yang.domain.TbUserQuery;
import stu.yang.entity.TbUser;
import stu.yang.service.TbUserBaseService;
import stu.yang.util.ResponseUtil;

import javax.annotation.Resource;
import java.util.List;

@Service("tbUserBaseService")
public class TbUserBaseServiceImpl implements TbUserBaseService {

    @Resource
    private TbUserMapper tbUserMapper;


    /**
     * {@inheritDoc}
     */
	@Override
    public boolean insert(final List<TbUser> tbUserList) {
        boolean resultFlag = false;
        if (null != tbUserList && tbUserList.size() > 0) {
            for (TbUser tbUser : tbUserList) {
                resultFlag = tbUserMapper.insert(tbUser);
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
    public boolean insert(TbUser tbUser) {
        return tbUserMapper.insert(tbUser);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean update(final TbUser tbUser) {
        return tbUserMapper.update(tbUser);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public List<TbUser> queryTbUserList(TbUserQuery queryBean) {
        return tbUserMapper.queryTbUserList(queryBean);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public PagedListResponse<TbUser> queryTbUserListWithPage(TbUserQuery queryBean) {
        if (null == queryBean) {
            queryBean = new TbUserQuery();
        }
        // 查询总数
        Integer totalCount = tbUserMapper.queryTbUserCount(queryBean);
        List<TbUser> tbUserList = tbUserMapper.queryTbUserListWithPage(queryBean);
        return ResponseUtil.getPagedResultListResponse(totalCount,queryBean.getPageSize(),queryBean.getCurrentPage(),tbUserList);
    }


    /**
     * {@inheritDoc}
     */
	@Override
    public int queryTbUserCount(TbUserQuery queryBean) {
        return tbUserMapper.queryTbUserCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean delete(TbUser tbUser) {
        return tbUserMapper.delete(tbUser);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public TbUser getTbUserById(Long id) {
        return tbUserMapper.getTbUserById(id);
    }

    /**
     * {@inheritDoc}
     */
	@Override
    public boolean delete(final TbUser[] tbUsers) {
        boolean resultFlag = false;
        if (null != tbUsers && tbUsers.length > 0) {
            for (int i = 0; i < tbUsers.length; i++) {
                resultFlag = delete(tbUsers[i]);
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
    public boolean exist(TbUser tbUser) {
        return tbUserMapper.exist(tbUser) > 0;
    }

}
