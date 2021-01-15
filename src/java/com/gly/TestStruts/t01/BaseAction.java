package com.gly.TestStruts.t01;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import java.util.Map;

/**
 * 自己编写的action类本身要继承ActionSupport
 * 目的让自己编写的action继承BaseAction,如果对框架中某些应用场景有不同观点，可以通过这个类修改
 * requestAware\...
 */
public class BaseAction extends ActionSupport implements RequestAware,SessionAware,ServletContextAware{
	public Map<String,Object> req;
	public Map<String,Object> ses;
	public ServletContext app;
	@Override
	public void setServletContext(ServletContext context) {
		app = context;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		ses = session;
	}
	@Override
	public void setRequest(Map<String, Object> request) {
		req = request;
	}
	
	

}
