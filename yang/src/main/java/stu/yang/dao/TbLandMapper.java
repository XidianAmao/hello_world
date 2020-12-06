package stu.yang.dao;

import stu.yang.domain.TbLandQuery;
import stu.yang.entity.TbLand;

import java.util.List;


public interface TbLandMapper {
    
    /**
     * 新增对象
     * 
     * @param tbLand 
     * @return
     */
    public boolean insert(TbLand tbLand);

    /**
     * 更新对象
     * 
     * @param tbLand
     * @return
     */
    public boolean update(TbLand tbLand);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbLand> queryTbLandList(TbLandQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryTbLandCount(TbLandQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbLand> queryTbLandListWithPage(TbLandQuery queryBean);

    /**
     * 删除记录
     * 
     * @param tbLand
     * @return
     */
    public boolean delete(TbLand tbLand);

    /**
     * 根据主键获取对象
     * 
     * @param id 主键字段
     * @return
     */
    public TbLand getTbLandById(Long id);

    /**
     * 判断是否存在
     * 
     * @param tbLand
     * @return
     */
    public int exist(TbLand tbLand);

}
