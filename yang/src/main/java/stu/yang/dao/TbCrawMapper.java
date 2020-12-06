package stu.yang.dao;

import stu.yang.domain.TbCrawQuery;
import stu.yang.entity.TbCraw;

import java.util.List;


public interface TbCrawMapper {
    
    /**
     * 新增对象
     * 
     * @param tbCraw 
     * @return
     */
    public boolean insert(TbCraw tbCraw);

    /**
     * 更新对象
     * 
     * @param tbCraw
     * @return
     */
    public boolean update(TbCraw tbCraw);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbCraw> queryTbCrawList(TbCrawQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryTbCrawCount(TbCrawQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbCraw> queryTbCrawListWithPage(TbCrawQuery queryBean);

    /**
     * 删除记录
     * 
     * @param tbCraw
     * @return
     */
    public boolean delete(TbCraw tbCraw);

    /**
     * 根据主键获取对象
     * 
     * @param id 主键字段
     * @return
     */
    public TbCraw getTbCrawById(Long id);

    /**
     * 判断是否存在
     * 
     * @param tbCraw
     * @return
     */
    public int exist(TbCraw tbCraw);

}
