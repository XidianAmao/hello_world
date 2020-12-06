package stu.yang.service;


import stu.yang.domain.PagedListResponse;
import stu.yang.domain.TbUserQuery;
import stu.yang.entity.TbUser;

import java.util.List;


public interface TbUserBaseService {

    /**
     * 批量增加对象信息
     * 
     * @param
     * @return
     */
    public boolean insert(List<TbUser> tbUserList);

    /**
     * 单个增加对象信息
     * 
     * @param tbUser
     * @return
     */
    public boolean insert(TbUser tbUser);

    /**
     * 更新 对象信息
     * 
     * @param tbUser 对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(TbUser tbUser);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbUser> queryTbUserList(TbUserQuery queryBean);

    /**
     * 分页查询供应商列表
     * @param queryBean
     * @return
     */
    public PagedListResponse<TbUser> queryTbUserListWithPage(TbUserQuery queryBean);

			

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryTbUserCount(TbUserQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param tbUser
     *            　
     * @return
     */
    public boolean delete(TbUser tbUser);

    /**
     * 根据主键获取对象信息
     * 
     * @param id 主键字段
     * @return 对象信息
     */
    public TbUser getTbUserById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param tbUsers TbUser集合
     * @return
     */
    public boolean delete(TbUser[] tbUsers);

    /**
     * 判断是否存在
     * 
     * @param tbUser
     * @return
     */
    public boolean exist(TbUser tbUser);


}
