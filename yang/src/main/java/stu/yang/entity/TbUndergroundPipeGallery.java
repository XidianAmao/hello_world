package stu.yang.entity;

import java.util.Date;


public class TbUndergroundPipeGallery implements java.io.Serializable  {

    /** 序列化标识 */
	private static final long serialVersionUID = 1L;
	
    /** 地下管廊信息表id */
    private Integer id; 
    /** 地块编号 */
    private String landNo; 
    /** 地下管廊信息描述 */
    private String undergroundPipeGalleryDesc; 
    /** 地下管廊信息类型（1:给水管廊数据、2:排水管廊数据、3:再生水管廊数据等） */
    private Integer undergroundPipeGalleryType; 
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
    
    public String getUndergroundPipeGalleryDesc(){
        return undergroundPipeGalleryDesc;
    }
        
    public void setUndergroundPipeGalleryDesc(String undergroundPipeGalleryDesc) {
        this.undergroundPipeGalleryDesc = undergroundPipeGalleryDesc;
    }
    
    public Integer getUndergroundPipeGalleryType(){
        return undergroundPipeGalleryType;
    }
        
    public void setUndergroundPipeGalleryType(Integer undergroundPipeGalleryType) {
        this.undergroundPipeGalleryType = undergroundPipeGalleryType;
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
