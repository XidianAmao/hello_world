package stu.yang.service;


import stu.yang.domain.PagedListResponse;
import stu.yang.domain.TbCrawQuery;
import stu.yang.entity.TbCraw;

import java.util.List;


public interface TbCrawBaseService {

    /**
     * 批量增加对象信息
     * 
     * @param
     * @return
     */
    public boolean insert(List<TbCraw> tbCrawList);

    /**
     * 单个增加对象信息
     * 
     * @param tbCraw
     * @return
     */
    public boolean insert(TbCraw tbCraw);

    /**
     * 更新 对象信息
     * 
     * @param tbCraw 对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(TbCraw tbCraw);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbCraw> queryTbCrawList(TbCrawQuery queryBean);

    /**
     * 分页查询供应商列表
     * @param queryBean
     * @return
     */
    public PagedListResponse<TbCraw> queryTbCrawListWithPage(TbCrawQuery queryBean);

			

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryTbCrawCount(TbCrawQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param tbCraw
     *            　
     * @return
     */
    public boolean delete(TbCraw tbCraw);

    /**
     * 根据主键获取对象信息
     * 
     * @param id 主键字段
     * @return 对象信息
     */
    public TbCraw getTbCrawById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param tbCraws TbCraw集合
     * @return
     */
    public boolean delete(TbCraw[] tbCraws);

    /**
     * 判断是否存在
     * 
     * @param tbCraw
     * @return
     */
    public boolean exist(TbCraw tbCraw);


}
