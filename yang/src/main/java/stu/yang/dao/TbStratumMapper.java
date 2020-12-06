package stu.yang.dao;

import stu.yang.domain.TbStratumQuery;
import stu.yang.entity.TbStratum;

import java.util.List;

public interface TbStratumMapper {
    
    /**
     * 新增对象
     * 
     * @param tbStratum 
     * @return
     */
    public boolean insert(TbStratum tbStratum);

    /**
     * 更新对象
     * 
     * @param tbStratum
     * @return
     */
    public boolean update(TbStratum tbStratum);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbStratum> queryTbStratumList(TbStratumQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryTbStratumCount(TbStratumQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbStratum> queryTbStratumListWithPage(TbStratumQuery queryBean);

    /**
     * 删除记录
     * 
     * @param tbStratum
     * @return
     */
    public boolean delete(TbStratum tbStratum);

    /**
     * 根据主键获取对象
     * 
     * @param id 主键字段
     * @return
     */
    public TbStratum getTbStratumById(Long id);

    /**
     * 判断是否存在
     * 
     * @param tbStratum
     * @return
     */
    public int exist(TbStratum tbStratum);

}
