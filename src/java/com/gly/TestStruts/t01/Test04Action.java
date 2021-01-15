package com.gly.TestStruts.t01;

import com.opensymphony.xwork2.ActionSupport;

/*
 * 1. 属性驱动： 
 * 	  - 在Action中创建与页面中某控件name相同的成员变量
 * 	  - 提供该成员变量的set方法
 * 	  - 如果其他类用到该变量，则需要提供get方法
 */
public class Test04Action extends ActionSupport {

	private String name1 ;   // 属性
	private String name2 ;   // 属性
	private String name3 ;   // 成员变量

	public String toList() throws Exception {
		String name3 ; 
		System.out.println(name1);
		return "success";
	}
	
	public void setName1(String name1) {
		this.name1 = name1;
	}
	
	public void setName2(String name1) {
		this.name2 = name1;
	}
	
	
}
