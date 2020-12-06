package stu.yang.dao;

import stu.yang.domain.TbConstructionInteractionQuery;
import stu.yang.entity.TbConstructionInteraction;

import java.util.List;


public interface TbConstructionInteractionMapper {
    
    /**
     * 新增对象
     * 
     * @param tbConstructionInteraction 
     * @return
     */
    public boolean insert(TbConstructionInteraction tbConstructionInteraction);

    /**
     * 更新对象
     * 
     * @param tbConstructionInteraction
     * @return
     */
    public boolean update(TbConstructionInteraction tbConstructionInteraction);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbConstructionInteraction> queryTbConstructionInteractionList(TbConstructionInteractionQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryTbConstructionInteractionCount(TbConstructionInteractionQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbConstructionInteraction> queryTbConstructionInteractionListWithPage(TbConstructionInteractionQuery queryBean);

    /**
     * 删除记录
     * 
     * @param tbConstructionInteraction
     * @return
     */
    public boolean delete(TbConstructionInteraction tbConstructionInteraction);

    /**
     * 根据主键获取对象
     * 
     * @param id 主键字段
     * @return
     */
    public TbConstructionInteraction getTbConstructionInteractionById(Long id);

    /**
     * 判断是否存在
     * 
     * @param tbConstructionInteraction
     * @return
     */
    public int exist(TbConstructionInteraction tbConstructionInteraction);

}
