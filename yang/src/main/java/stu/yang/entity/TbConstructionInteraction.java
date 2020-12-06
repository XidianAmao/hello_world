package stu.yang.entity;

import java.util.Date;


public class TbConstructionInteraction implements java.io.Serializable  {

    /** 序列化标识 */
	private static final long serialVersionUID = 1L;
	
    /** 施工交互信息表id */
    private Integer id; 
    /** 地块编号 */
    private String landNo; 
    /** 施工交互信息描述 */
    private String constructionInteractionDesc; 
    /** 施工交互信息类型（1:工程设计数据、2:工程施工数据、3:工程监测数据等） */
    private Integer constructionInteractionType; 
    /** 数据描述 */
    private String dataDesc; 
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
    
    public String getConstructionInteractionDesc(){
        return constructionInteractionDesc;
    }
        
    public void setConstructionInteractionDesc(String constructionInteractionDesc) {
        this.constructionInteractionDesc = constructionInteractionDesc;
    }
    
    public Integer getConstructionInteractionType(){
        return constructionInteractionType;
    }
        
    public void setConstructionInteractionType(Integer constructionInteractionType) {
        this.constructionInteractionType = constructionInteractionType;
    }
    
    public String getDataDesc(){
        return dataDesc;
    }
        
    public void setDataDesc(String dataDesc) {
        this.dataDesc = dataDesc;
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
