package stu.yang.service;


import stu.yang.domain.PagedListResponse;
import stu.yang.domain.TbLandQuery;
import stu.yang.entity.TbLand;

import java.util.List;


public interface TbLandBaseService {

    /**
     * 批量增加对象信息
     * 
     * @param
     * @return
     */
    public boolean insert(List<TbLand> tbLandList);

    /**
     * 单个增加对象信息
     * 
     * @param tbLand
     * @return
     */
    public boolean insert(TbLand tbLand);

    /**
     * 更新 对象信息
     * 
     * @param tbLand 对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(TbLand tbLand);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbLand> queryTbLandList(TbLandQuery queryBean);

    /**
     * 分页查询供应商列表
     * @param queryBean
     * @return
     */
    public PagedListResponse<TbLand> queryTbLandListWithPage(TbLandQuery queryBean);

			

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryTbLandCount(TbLandQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param tbLand
     *            　
     * @return
     */
    public boolean delete(TbLand tbLand);

    /**
     * 根据主键获取对象信息
     * 
     * @param id 主键字段
     * @return 对象信息
     */
    public TbLand getTbLandById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param tbLands TbLand集合
     * @return
     */
    public boolean delete(TbLand[] tbLands);

    /**
     * 判断是否存在
     * 
     * @param tbLand
     * @return
     */
    public boolean exist(TbLand tbLand);


}
