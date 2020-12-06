package stu.yang.dao;

import stu.yang.domain.TbUndergroundPipeGalleryQuery;
import stu.yang.entity.TbUndergroundPipeGallery;

import java.util.List;

public interface TbUndergroundPipeGalleryMapper {
    
    /**
     * 新增对象
     * 
     * @param tbUndergroundPipeGallery 
     * @return
     */
    public boolean insert(TbUndergroundPipeGallery tbUndergroundPipeGallery);

    /**
     * 更新对象
     * 
     * @param tbUndergroundPipeGallery
     * @return
     */
    public boolean update(TbUndergroundPipeGallery tbUndergroundPipeGallery);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbUndergroundPipeGallery> queryTbUndergroundPipeGalleryList(TbUndergroundPipeGalleryQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryTbUndergroundPipeGalleryCount(TbUndergroundPipeGalleryQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbUndergroundPipeGallery> queryTbUndergroundPipeGalleryListWithPage(TbUndergroundPipeGalleryQuery queryBean);

    /**
     * 删除记录
     * 
     * @param tbUndergroundPipeGallery
     * @return
     */
    public boolean delete(TbUndergroundPipeGallery tbUndergroundPipeGallery);

    /**
     * 根据主键获取对象
     * 
     * @param id 主键字段
     * @return
     */
    public TbUndergroundPipeGallery getTbUndergroundPipeGalleryById(Long id);

    /**
     * 判断是否存在
     * 
     * @param tbUndergroundPipeGallery
     * @return
     */
    public int exist(TbUndergroundPipeGallery tbUndergroundPipeGallery);

}
