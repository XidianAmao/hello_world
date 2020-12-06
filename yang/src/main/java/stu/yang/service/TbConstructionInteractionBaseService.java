package stu.yang.service;


import stu.yang.domain.PagedListResponse;
import stu.yang.domain.TbConstructionInteractionQuery;
import stu.yang.entity.TbConstructionInteraction;

import java.util.List;

public interface TbConstructionInteractionBaseService {

    /**
     * 批量增加对象信息
     * 
     * @param
     * @return
     */
    public boolean insert(List<TbConstructionInteraction> tbConstructionInteractionList);

    /**
     * 单个增加对象信息
     * 
     * @param tbConstructionInteraction
     * @return
     */
    public boolean insert(TbConstructionInteraction tbConstructionInteraction);

    /**
     * 更新 对象信息
     * 
     * @param tbConstructionInteraction 对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(TbConstructionInteraction tbConstructionInteraction);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbConstructionInteraction> queryTbConstructionInteractionList(TbConstructionInteractionQuery queryBean);

    /**
     * 分页查询供应商列表
     * @param queryBean
     * @return
     */
    public PagedListResponse<TbConstructionInteraction> queryTbConstructionInteractionListWithPage(TbConstructionInteractionQuery queryBean);

			

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryTbConstructionInteractionCount(TbConstructionInteractionQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param tbConstructionInteraction
     *            　
     * @return
     */
    public boolean delete(TbConstructionInteraction tbConstructionInteraction);

    /**
     * 根据主键获取对象信息
     * 
     * @param id 主键字段
     * @return 对象信息
     */
    public TbConstructionInteraction getTbConstructionInteractionById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param tbConstructionInteractions TbConstructionInteraction集合
     * @return
     */
    public boolean delete(TbConstructionInteraction[] tbConstructionInteractions);

    /**
     * 判断是否存在
     * 
     * @param tbConstructionInteraction
     * @return
     */
    public boolean exist(TbConstructionInteraction tbConstructionInteraction);


}
