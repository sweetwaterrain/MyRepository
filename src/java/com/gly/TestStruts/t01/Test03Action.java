package com.gly.TestStruts.t01;

public class Test03Action extends BaseAction{

	public String t03(){
		System.out.println("t03");
		req.put("hello", "h");
		ses.put("sess", "he");
		return SUCCESS;
	}

	
}
