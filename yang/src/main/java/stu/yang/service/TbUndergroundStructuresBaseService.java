package stu.yang.service;


import stu.yang.domain.PagedListResponse;
import stu.yang.domain.TbUndergroundStructuresQuery;
import stu.yang.entity.TbUndergroundStructures;

import java.util.List;

public interface TbUndergroundStructuresBaseService {

    /**
     * 批量增加对象信息
     * 
     * @param
     * @return
     */
    public boolean insert(List<TbUndergroundStructures> tbUndergroundStructuresList);

    /**
     * 单个增加对象信息
     * 
     * @param tbUndergroundStructures
     * @return
     */
    public boolean insert(TbUndergroundStructures tbUndergroundStructures);

    /**
     * 更新 对象信息
     * 
     * @param tbUndergroundStructures 对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(TbUndergroundStructures tbUndergroundStructures);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbUndergroundStructures> queryTbUndergroundStructuresList(TbUndergroundStructuresQuery queryBean);

    /**
     * 分页查询供应商列表
     * @param queryBean
     * @return
     */
    public PagedListResponse<TbUndergroundStructures> queryTbUndergroundStructuresListWithPage(TbUndergroundStructuresQuery queryBean);

			

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryTbUndergroundStructuresCount(TbUndergroundStructuresQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param tbUndergroundStructures
     *            　
     * @return
     */
    public boolean delete(TbUndergroundStructures tbUndergroundStructures);

    /**
     * 根据主键获取对象信息
     * 
     * @param id 主键字段
     * @return 对象信息
     */
    public TbUndergroundStructures getTbUndergroundStructuresById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param tbUndergroundStructuress TbUndergroundStructures集合
     * @return
     */
    public boolean delete(TbUndergroundStructures[] tbUndergroundStructuress);

    /**
     * 判断是否存在
     * 
     * @param tbUndergroundStructures
     * @return
     */
    public boolean exist(TbUndergroundStructures tbUndergroundStructures);


}
