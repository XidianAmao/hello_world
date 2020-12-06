package stu.yang.domain;


import java.util.Date;

public class TbCrawQuery extends QueryWithOrder  {

    /** 序列化标识 */
	private static final long serialVersionUID = 1L;
	
    /** 主键 */
    private Integer id; 
    /** 页面地址 */
    private String url; 
    /** 标题 */
    private String title; 
    /** 内容 */
    private String content; 
    /** 创建日期 */
    private Date createdAt; 
    
    public Integer getId(){
        return id;
    }
        
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getUrl(){
        return url;
    }
        
    public void setUrl(String url) {
        this.url = url;
    }
    
    public String getTitle(){
        return title;
    }
        
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getContent(){
        return content;
    }
        
    public void setContent(String content) {
        this.content = content;
    }
    
    public Date getCreatedAt(){
        return createdAt;
    }
        
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
