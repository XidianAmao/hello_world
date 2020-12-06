package stu.yang.entity;

import java.util.Date;


public class TbAttachment implements java.io.Serializable  {

    /** 序列化标识 */
	private static final long serialVersionUID = 1L;
	
    /** 数据附件表id */
    private Integer id; 
    /** 地块编号 */
    private String landNo; 
    /** 业务类型 */
    private Integer bizType; 
    /** 附件类型 */
    private Integer attachmentType; 
    /** 附件链接 */
    private String attachmentUrl; 
    /** 附件大小 */
    private Integer attachmentSize; 
    /** 录入时间 */
    private Date createdAt; 
    /** 录入人员 */
    private String createdUser; 
    
    public Integer getId(){
        return id;
    }
        
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getLandNo(){
        return landNo;
    }
        
    public void setLandNo(String landNo) {
        this.landNo = landNo;
    }
    
    public Integer getBizType(){
        return bizType;
    }
        
    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }
    
    public Integer getAttachmentType(){
        return attachmentType;
    }
        
    public void setAttachmentType(Integer attachmentType) {
        this.attachmentType = attachmentType;
    }
    
    public String getAttachmentUrl(){
        return attachmentUrl;
    }
        
    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }
    
    public Integer getAttachmentSize(){
        return attachmentSize;
    }
        
    public void setAttachmentSize(Integer attachmentSize) {
        this.attachmentSize = attachmentSize;
    }
    
    public Date getCreatedAt(){
        return createdAt;
    }
        
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
    public String getCreatedUser(){
        return createdUser;
    }
        
    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }
}
