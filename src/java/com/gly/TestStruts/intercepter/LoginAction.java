package com.gly.TestStruts.intercepter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.Map;

public class LoginAction extends ActionSupport implements ModelDriven<User>{

	private User user = new User();
	
	public String login() throws Exception {
		// 1. 假定在数据库中查询出的用户名密码如下
		String db_username = "admin";
		String db_password = "admin";
		String result = SUCCESS;
		if(db_username.equals(user.getUsername()) && db_password.equals(user.getPassword())){
			Map<String, Object> session = ActionContext.getContext().getSession();
			session.put("user", user);
		} else {
			result = ERROR;
		}
		return result;
	}

	@Override
	public User getModel() {
		return user;
	}
	
}
