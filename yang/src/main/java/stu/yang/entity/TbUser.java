package stu.yang.entity;

import java.util.Date;

/**
 * 表：tb_user的实体类
 * 
 * @author chenlei
 * @version 1.0
 * @name stu.yang.entity.TbUser.java
 * @Date 2020-12-6 21:43:24
 * @Description:
 * 
 */
public class TbUser implements java.io.Serializable  {

    /** 序列化标识 */
	private static final long serialVersionUID = 1L;
	
    /** 主键 */
    private Integer id; 
    /** 账号 */
    private String account; 
    /** 密码 */
    private String password; 
    /** 用户名 */
    private String name; 
    /** 创建日期 */
    private Date createdAt; 
    
    public Integer getId(){
        return id;
    }
        
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getAccount(){
        return account;
    }
        
    public void setAccount(String account) {
        this.account = account;
    }
    
    public String getPassword(){
        return password;
    }
        
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getName(){
        return name;
    }
        
    public void setName(String name) {
        this.name = name;
    }
    
    public Date getCreatedAt(){
        return createdAt;
    }
        
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
