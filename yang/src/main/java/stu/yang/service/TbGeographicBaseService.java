package stu.yang.service;


import stu.yang.domain.PagedListResponse;
import stu.yang.domain.TbGeographicQuery;
import stu.yang.entity.TbGeographic;

import java.util.List;


public interface TbGeographicBaseService {

    /**
     * 批量增加对象信息
     * 
     * @param
     * @return
     */
    public boolean insert(List<TbGeographic> tbGeographicList);

    /**
     * 单个增加对象信息
     * 
     * @param tbGeographic
     * @return
     */
    public boolean insert(TbGeographic tbGeographic);

    /**
     * 更新 对象信息
     * 
     * @param tbGeographic 对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(TbGeographic tbGeographic);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbGeographic> queryTbGeographicList(TbGeographicQuery queryBean);

    /**
     * 分页查询供应商列表
     * @param queryBean
     * @return
     */
    public PagedListResponse<TbGeographic> queryTbGeographicListWithPage(TbGeographicQuery queryBean);

			

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryTbGeographicCount(TbGeographicQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param tbGeographic
     *            　
     * @return
     */
    public boolean delete(TbGeographic tbGeographic);

    /**
     * 根据主键获取对象信息
     * 
     * @param id 主键字段
     * @return 对象信息
     */
    public TbGeographic getTbGeographicById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param tbGeographics TbGeographic集合
     * @return
     */
    public boolean delete(TbGeographic[] tbGeographics);

    /**
     * 判断是否存在
     * 
     * @param tbGeographic
     * @return
     */
    public boolean exist(TbGeographic tbGeographic);


}
