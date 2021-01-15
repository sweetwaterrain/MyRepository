package com.gly.TestStruts.t01;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/*
 * 模型驱动： 
 * 	1. 实现ModelDriven接口，指定泛型为欲获取的对象
 *  2. 根据泛型创建某个类型对象（成员变量）
 *  3. 重写ModelDriven接口getModel()，并返回第二步创建的对象。
 *  4. 页面中不需要使用对象名.属性名的方式，直接使用属性名
 */
public class Test06Action extends ActionSupport implements ModelDriven<User>{

	private User user = new User() ;
	
	public String go() throws Exception {
		System.out.println(user.getUsername() + ";" + user.getPassword());
		return SUCCESS;
	}
	
	@Override
	public User getModel() {
		return user;
	}

	
}
