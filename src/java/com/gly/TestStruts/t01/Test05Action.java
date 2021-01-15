package com.gly.TestStruts.t01;

import com.opensymphony.xwork2.ActionSupport;

/*
 * 对象驱动
 * 	1. 创建类：整合前台form中控件name
 * 		类的属性对应form中input域的name属性
 *	2. 在action创建对象(new)。
 *  3. 提供该对象的get/set
 *  4. 注意： form中控件name属性要符合(对象.属性名)格式
 */
public class Test05Action extends ActionSupport {

	private User user = new User();

	public String go() throws Exception {
		System.out.println(user.getUsername() + ";" + user.getPassword());
		return SUCCESS;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
