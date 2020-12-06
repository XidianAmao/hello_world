package stu.yang.dao;

import stu.yang.domain.TbTerrainQuery;
import stu.yang.entity.TbTerrain;

import java.util.List;


public interface TbTerrainMapper {
    
    /**
     * 新增对象
     * 
     * @param tbTerrain 
     * @return
     */
    public boolean insert(TbTerrain tbTerrain);

    /**
     * 更新对象
     * 
     * @param tbTerrain
     * @return
     */
    public boolean update(TbTerrain tbTerrain);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbTerrain> queryTbTerrainList(TbTerrainQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryTbTerrainCount(TbTerrainQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbTerrain> queryTbTerrainListWithPage(TbTerrainQuery queryBean);

    /**
     * 删除记录
     * 
     * @param tbTerrain
     * @return
     */
    public boolean delete(TbTerrain tbTerrain);

    /**
     * 根据主键获取对象
     * 
     * @param id 主键字段
     * @return
     */
    public TbTerrain getTbTerrainById(Long id);

    /**
     * 判断是否存在
     * 
     * @param tbTerrain
     * @return
     */
    public int exist(TbTerrain tbTerrain);

}
