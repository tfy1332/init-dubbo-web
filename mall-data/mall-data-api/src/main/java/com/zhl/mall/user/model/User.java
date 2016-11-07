package com.zhl.mall.user.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 用户信息
 * by tanfy 2016-07-06
 */
@Document(collection = "mall_user")
public class User implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3838120300031725099L;
	@Id
	private String id;
	//用户ID
	private String userid;
	//用户名
	private String username;
	//邮箱
	private String email;
	//密码
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}
}
