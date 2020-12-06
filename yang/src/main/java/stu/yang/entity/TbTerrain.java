package stu.yang.entity;

import java.util.Date;


public class TbTerrain implements java.io.Serializable  {

    /** 序列化标识 */
	private static final long serialVersionUID = 1L;
	
    /** 地形信息表id */
    private Integer id; 
    /** 地块编号 */
    private String landNo; 
    /** 地形描述 */
    private String terrainDesc; 
    /** 地形类型（1:地貌数据、2:等高线数据、3:植被数据） */
    private Integer terrainType; 
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
    
    public String getTerrainDesc(){
        return terrainDesc;
    }
        
    public void setTerrainDesc(String terrainDesc) {
        this.terrainDesc = terrainDesc;
    }
    
    public Integer getTerrainType(){
        return terrainType;
    }
        
    public void setTerrainType(Integer terrainType) {
        this.terrainType = terrainType;
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
