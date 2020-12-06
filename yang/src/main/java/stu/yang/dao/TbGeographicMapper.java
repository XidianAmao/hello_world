package stu.yang.dao;

import stu.yang.domain.TbGeographicQuery;
import stu.yang.entity.TbGeographic;

import java.util.List;

public interface TbGeographicMapper {
    
    /**
     * 新增对象
     * 
     * @param tbGeographic 
     * @return
     */
    public boolean insert(TbGeographic tbGeographic);

    /**
     * 更新对象
     * 
     * @param tbGeographic
     * @return
     */
    public boolean update(TbGeographic tbGeographic);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbGeographic> queryTbGeographicList(TbGeographicQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryTbGeographicCount(TbGeographicQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbGeographic> queryTbGeographicListWithPage(TbGeographicQuery queryBean);

    /**
     * 删除记录
     * 
     * @param tbGeographic
     * @return
     */
    public boolean delete(TbGeographic tbGeographic);

    /**
     * 根据主键获取对象
     * 
     * @param id 主键字段
     * @return
     */
    public TbGeographic getTbGeographicById(Long id);

    /**
     * 判断是否存在
     * 
     * @param tbGeographic
     * @return
     */
    public int exist(TbGeographic tbGeographic);

}
