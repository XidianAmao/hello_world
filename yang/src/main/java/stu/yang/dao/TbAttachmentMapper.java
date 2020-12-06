package stu.yang.dao;

import stu.yang.domain.TbAttachmentQuery;
import stu.yang.entity.TbAttachment;

import java.util.List;


public interface TbAttachmentMapper {
    
    /**
     * 新增对象
     * 
     * @param tbAttachment 
     * @return
     */
    public boolean insert(TbAttachment tbAttachment);

    /**
     * 更新对象
     * 
     * @param tbAttachment
     * @return
     */
    public boolean update(TbAttachment tbAttachment);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbAttachment> queryTbAttachmentList(TbAttachmentQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryTbAttachmentCount(TbAttachmentQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TbAttachment> queryTbAttachmentListWithPage(TbAttachmentQuery queryBean);

    /**
     * 删除记录
     * 
     * @param tbAttachment
     * @return
     */
    public boolean delete(TbAttachment tbAttachment);

    /**
     * 根据主键获取对象
     * 
     * @param id 主键字段
     * @return
     */
    public TbAttachment getTbAttachmentById(Long id);

    /**
     * 判断是否存在
     * 
     * @param tbAttachment
     * @return
     */
    public int exist(TbAttachment tbAttachment);

}
