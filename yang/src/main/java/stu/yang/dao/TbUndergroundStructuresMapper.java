package stu.yang.dao;

import stu.yang.domain.TbUndergroundStructuresQuery;
import stu.yang.entity.TbUndergroundStructures;

import java.util.List;

public interface TbUndergroundStructuresMapper {
    
    /**
     * 新增对象
     * 
     * @param tbUndergroundStructures 
     * @return
     */
    public boolean insert(TbUndergroundStructures tbUndergroundStructures);

    /**
     * 更新对象
     * 
     * @param tbUndergroundStructures
     * @return
     */
    public boolean update(TbUndergroundStructures tbUndergroundStructures);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbUndergroundStructures> queryTbUndergroundStructuresList(TbUndergroundStructuresQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryTbUndergroundStructuresCount(TbUndergroundStructuresQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbUndergroundStructures> queryTbUndergroundStructuresListWithPage(TbUndergroundStructuresQuery queryBean);

    /**
     * 删除记录
     * 
     * @param tbUndergroundStructures
     * @return
     */
    public boolean delete(TbUndergroundStructures tbUndergroundStructures);

    /**
     * 根据主键获取对象
     * 
     * @param id 主键字段
     * @return
     */
    public TbUndergroundStructures getTbUndergroundStructuresById(Long id);

    /**
     * 判断是否存在
     * 
     * @param tbUndergroundStructures
     * @return
     */
    public int exist(TbUndergroundStructures tbUndergroundStructures);

}
