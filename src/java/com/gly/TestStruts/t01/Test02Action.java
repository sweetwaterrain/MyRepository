package com.gly.TestStruts.t01;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class Test02Action extends ActionSupport{
	
	public String login() throws Exception {
		// 获取actionContext对象
		ActionContext actionContext = ActionContext.getContext();
		// 1. 获取request
		Map<String,Object> map = (Map<String,Object>)actionContext.get("request");
		map.put("hello", "hello");
		// 结论： 无法直接转换为request，以下代码错误
//		HttpServletRequest request = (HttpServletRequest)actionContext.get("request");
//		request.setAttribute("hello2", "hello2");
		// 2. 获取session对象
		// actionContext.get("session");
		Map<String, Object> session = actionContext.getSession();   // 推荐
		session.put("session1", "session1");
		// 3. 获取application对象
		// actionContext.get("application");
		actionContext.getApplication(); // 推荐
		// 4. struts中使用ActionContext替代request
		actionContext.put("ac_key01", "hello");
		
		
		System.out.println("login");
		return SUCCESS;
	}
	
	public String index() throws Exception {
		System.out.println("index");
		return SUCCESS;
	}

}
