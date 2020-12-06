package stu.yang.service;


import stu.yang.domain.PagedListResponse;
import stu.yang.domain.TbUndergroundPipeGalleryQuery;
import stu.yang.entity.TbUndergroundPipeGallery;

import java.util.List;

public interface TbUndergroundPipeGalleryBaseService {

    /**
     * 批量增加对象信息
     * 
     * @param
     * @return
     */
    public boolean insert(List<TbUndergroundPipeGallery> tbUndergroundPipeGalleryList);

    /**
     * 单个增加对象信息
     * 
     * @param tbUndergroundPipeGallery
     * @return
     */
    public boolean insert(TbUndergroundPipeGallery tbUndergroundPipeGallery);

    /**
     * 更新 对象信息
     * 
     * @param tbUndergroundPipeGallery 对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(TbUndergroundPipeGallery tbUndergroundPipeGallery);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbUndergroundPipeGallery> queryTbUndergroundPipeGalleryList(TbUndergroundPipeGalleryQuery queryBean);

    /**
     * 分页查询供应商列表
     * @param queryBean
     * @return
     */
    public PagedListResponse<TbUndergroundPipeGallery> queryTbUndergroundPipeGalleryListWithPage(TbUndergroundPipeGalleryQuery queryBean);

			

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryTbUndergroundPipeGalleryCount(TbUndergroundPipeGalleryQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param tbUndergroundPipeGallery
     *            　
     * @return
     */
    public boolean delete(TbUndergroundPipeGallery tbUndergroundPipeGallery);

    /**
     * 根据主键获取对象信息
     * 
     * @param id 主键字段
     * @return 对象信息
     */
    public TbUndergroundPipeGallery getTbUndergroundPipeGalleryById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param tbUndergroundPipeGallerys TbUndergroundPipeGallery集合
     * @return
     */
    public boolean delete(TbUndergroundPipeGallery[] tbUndergroundPipeGallerys);

    /**
     * 判断是否存在
     * 
     * @param tbUndergroundPipeGallery
     * @return
     */
    public boolean exist(TbUndergroundPipeGallery tbUndergroundPipeGallery);


}
