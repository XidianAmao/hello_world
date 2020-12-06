package stu.yang.entity;

import java.util.Date;


public class TbLand implements java.io.Serializable  {

    /** 序列化标识 */
	private static final long serialVersionUID = 1L;
	
    /** 地块编号表id */
    private Integer id; 
    /** 地块编号 */
    private String landNo; 
    /** 城市码 */
    private Integer cityNo; 
    /** 地块性质码 */
    private String landPropertyNo; 
    /** 地块性质 */
    private String landProperty; 
    /** 地块面积（平方米） */
    private Integer landArea; 
    /** 地块地址信息 */
    private String landAddress; 
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
    
    public Integer getCityNo(){
        return cityNo;
    }
        
    public void setCityNo(Integer cityNo) {
        this.cityNo = cityNo;
    }
    
    public String getLandPropertyNo(){
        return landPropertyNo;
    }
        
    public void setLandPropertyNo(String landPropertyNo) {
        this.landPropertyNo = landPropertyNo;
    }
    
    public String getLandProperty(){
        return landProperty;
    }
        
    public void setLandProperty(String landProperty) {
        this.landProperty = landProperty;
    }
    
    public Integer getLandArea(){
        return landArea;
    }
        
    public void setLandArea(Integer landArea) {
        this.landArea = landArea;
    }
    
    public String getLandAddress(){
        return landAddress;
    }
        
    public void setLandAddress(String landAddress) {
        this.landAddress = landAddress;
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
