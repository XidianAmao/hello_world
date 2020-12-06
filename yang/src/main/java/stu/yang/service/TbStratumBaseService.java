package stu.yang.service;


import stu.yang.domain.PagedListResponse;
import stu.yang.domain.TbStratumQuery;
import stu.yang.entity.TbStratum;

import java.util.List;

public interface TbStratumBaseService {

    /**
     * 批量增加对象信息
     * 
     * @param
     * @return
     */
    public boolean insert(List<TbStratum> tbStratumList);

    /**
     * 单个增加对象信息
     * 
     * @param tbStratum
     * @return
     */
    public boolean insert(TbStratum tbStratum);

    /**
     * 更新 对象信息
     * 
     * @param tbStratum 对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(TbStratum tbStratum);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbStratum> queryTbStratumList(TbStratumQuery queryBean);

    /**
     * 分页查询供应商列表
     * @param queryBean
     * @return
     */
    public PagedListResponse<TbStratum> queryTbStratumListWithPage(TbStratumQuery queryBean);

			

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryTbStratumCount(TbStratumQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param tbStratum
     *            　
     * @return
     */
    public boolean delete(TbStratum tbStratum);

    /**
     * 根据主键获取对象信息
     * 
     * @param id 主键字段
     * @return 对象信息
     */
    public TbStratum getTbStratumById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param tbStratums TbStratum集合
     * @return
     */
    public boolean delete(TbStratum[] tbStratums);

    /**
     * 判断是否存在
     * 
     * @param tbStratum
     * @return
     */
    public boolean exist(TbStratum tbStratum);


}
