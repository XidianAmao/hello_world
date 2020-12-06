package stu.yang.service;


import stu.yang.domain.PagedListResponse;
import stu.yang.domain.TbAttachmentQuery;
import stu.yang.entity.TbAttachment;

import java.util.List;


public interface TbAttachmentBaseService {

    /**
     * 批量增加对象信息
     * 
     * @param
     * @return
     */
    public boolean insert(List<TbAttachment> tbAttachmentList);

    /**
     * 单个增加对象信息
     * 
     * @param tbAttachment
     * @return
     */
    public boolean insert(TbAttachment tbAttachment);

    /**
     * 更新 对象信息
     * 
     * @param tbAttachment 对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(TbAttachment tbAttachment);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbAttachment> queryTbAttachmentList(TbAttachmentQuery queryBean);

    /**
     * 分页查询供应商列表
     * @param queryBean
     * @return
     */
    public PagedListResponse<TbAttachment> queryTbAttachmentListWithPage(TbAttachmentQuery queryBean);

			

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryTbAttachmentCount(TbAttachmentQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param tbAttachment
     *            　
     * @return
     */
    public boolean delete(TbAttachment tbAttachment);

    /**
     * 根据主键获取对象信息
     * 
     * @param id 主键字段
     * @return 对象信息
     */
    public TbAttachment getTbAttachmentById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param tbAttachments TbAttachment集合
     * @return
     */
    public boolean delete(TbAttachment[] tbAttachments);

    /**
     * 判断是否存在
     * 
     * @param tbAttachment
     * @return
     */
    public boolean exist(TbAttachment tbAttachment);


}
