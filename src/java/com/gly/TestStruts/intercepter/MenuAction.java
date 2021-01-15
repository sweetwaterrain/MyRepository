package com.gly.TestStruts.intercepter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class MenuAction extends ActionSupport{

	public String show() throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.remove("user");
		System.out.println("show");
		return SUCCESS;
	}
	
}
