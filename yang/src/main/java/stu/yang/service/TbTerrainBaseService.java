package stu.yang.service;


import stu.yang.domain.PagedListResponse;
import stu.yang.domain.TbTerrainQuery;
import stu.yang.entity.TbTerrain;

import java.util.List;


public interface TbTerrainBaseService {

    /**
     * 批量增加对象信息
     * 
     * @param
     * @return
     */
    public boolean insert(List<TbTerrain> tbTerrainList);

    /**
     * 单个增加对象信息
     * 
     * @param tbTerrain
     * @return
     */
    public boolean insert(TbTerrain tbTerrain);

    /**
     * 更新 对象信息
     * 
     * @param tbTerrain 对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(TbTerrain tbTerrain);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbTerrain> queryTbTerrainList(TbTerrainQuery queryBean);

    /**
     * 分页查询供应商列表
     * @param queryBean
     * @return
     */
    public PagedListResponse<TbTerrain> queryTbTerrainListWithPage(TbTerrainQuery queryBean);

			

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryTbTerrainCount(TbTerrainQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param tbTerrain
     *            　
     * @return
     */
    public boolean delete(TbTerrain tbTerrain);

    /**
     * 根据主键获取对象信息
     * 
     * @param id 主键字段
     * @return 对象信息
     */
    public TbTerrain getTbTerrainById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param tbTerrains TbTerrain集合
     * @return
     */
    public boolean delete(TbTerrain[] tbTerrains);

    /**
     * 判断是否存在
     * 
     * @param tbTerrain
     * @return
     */
    public boolean exist(TbTerrain tbTerrain);


}
