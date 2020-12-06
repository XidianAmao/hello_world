package stu.yang.domain;


import java.util.Date;

public class TbStratumQuery extends QueryWithOrder  {

    /** 序列化标识 */
	private static final long serialVersionUID = 1L;
	
    /** 地层信息表id */
    private Integer id; 
    /** 地块编号 */
    private String landNo; 
    /** 地层信息描述 */
    private String stratumDesc; 
    /** 地层信息类型 */
    private Integer stratumType; 
    /** 地层信息数据 */
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
    
    public String getStratumDesc(){
        return stratumDesc;
    }
        
    public void setStratumDesc(String stratumDesc) {
        this.stratumDesc = stratumDesc;
    }
    
    public Integer getStratumType(){
        return stratumType;
    }
        
    public void setStratumType(Integer stratumType) {
        this.stratumType = stratumType;
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
