package stu.yang.dao;

import stu.yang.domain.TbUserQuery;
import stu.yang.entity.TbUser;

import java.util.List;

public interface TbUserMapper {
    
    /**
     * 新增对象
     * 
     * @param tbUser 
     * @return
     */
    public boolean insert(TbUser tbUser);

    /**
     * 更新对象
     * 
     * @param tbUser
     * @return
     */
    public boolean update(TbUser tbUser);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbUser> queryTbUserList(TbUserQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryTbUserCount(TbUserQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbUser> queryTbUserListWithPage(TbUserQuery queryBean);

    /**
     * 删除记录
     * 
     * @param tbUser
     * @return
     */
    public boolean delete(TbUser tbUser);

    /**
     * 根据主键获取对象
     * 
     * @param id 主键字段
     * @return
     */
    public TbUser getTbUserById(Long id);

    /**
     * 判断是否存在
     * 
     * @param tbUser
     * @return
     */
    public int exist(TbUser tbUser);

}
