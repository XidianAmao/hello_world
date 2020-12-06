package stu.yang.entity;

import java.util.Date;


public class TbGeographic implements java.io.Serializable  {

    /** 序列化标识 */
	private static final long serialVersionUID = 1L;
	
    /** 地理信息表id */
    private Integer id; 
    /** 地块编号 */
    private String landNo; 
    /** 地理信息描述 */
    private String geographicDesc; 
    /** 地理信息类型（1:行政区域数据、2:地表水系数据、3:地上交通数据等） */
    private Integer geographicType; 
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
    
    public String getGeographicDesc(){
        return geographicDesc;
    }
        
    public void setGeographicDesc(String geographicDesc) {
        this.geographicDesc = geographicDesc;
    }
    
    public Integer getGeographicType(){
        return geographicType;
    }
        
    public void setGeographicType(Integer geographicType) {
        this.geographicType = geographicType;
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
