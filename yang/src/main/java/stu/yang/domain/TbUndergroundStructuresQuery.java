package stu.yang.domain;


import java.util.Date;


public class TbUndergroundStructuresQuery extends QueryWithOrder  {

    /** 序列化标识 */
	private static final long serialVersionUID = 1L;
	
    /** 地下构筑物信息表id */
    private Integer id; 
    /** 地块编号 */
    private String landNo; 
    /** 地下构筑物信息描述 */
    private String undergroundStructuresDesc; 
    /** 地下构筑物信息类型（1:地下设施数据、2:地下交通数据、3:地下人防数据等） */
    private Integer undergroundStructuresType; 
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
    
    public String getUndergroundStructuresDesc(){
        return undergroundStructuresDesc;
    }
        
    public void setUndergroundStructuresDesc(String undergroundStructuresDesc) {
        this.undergroundStructuresDesc = undergroundStructuresDesc;
    }
    
    public Integer getUndergroundStructuresType(){
        return undergroundStructuresType;
    }
        
    public void setUndergroundStructuresType(Integer undergroundStructuresType) {
        this.undergroundStructuresType = undergroundStructuresType;
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
