/**   
* @Title: User.java 
* @Package cn.itheima.ssm.pojo 
* @Description: TODO(用一句话描述该文件做什么) 
* @author swuj   
* @date 2017年8月10日 下午2:46:00 
* @version V1.0   
*/
package cn.itheima.ssm.pojo;

import java.util.Date;

/** 
* @ClassName: User 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author swuj
* @date 2017年8月10日 下午2:46:00 
*  
*/
public class User {
	  private Integer id; //bigint(20) NOT NULL AUTO_INCREMENT,
	  private String user_name; //varchar(100) DEFAULT NULL COMMENT '用户名',
	  private String password; //varchar(100) DEFAULT NULL COMMENT '密码',
	  private String name; //varchar(100) DEFAULT NULL COMMENT '姓名',
	  private Integer age; //int(10) DEFAULT NULL COMMENT '年龄',
	  private Integer sex; //tinyint(1) DEFAULT NULL COMMENT '性别，1男性，2女性',
	  private Date birthday; //date DEFAULT NULL COMMENT '出生日期',
	  private Date created; //datetime DEFAULT NULL COMMENT '创建时间',
	  private Date updated; //datetime DEFAULT NULL COMMENT '更新时间',
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}
	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the sex
	 */
	public Integer getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}
	/**
	 * @param created the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}
	/**
	 * @return the updated
	 */
	public Date getUpdated() {
		return updated;
	}
	/**
	 * @param updated the updated to set
	 */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	  
	}
