package com.gly.TestStruts.t01;

import com.opensymphony.xwork2.Action;

public class Test01Action implements Action {

	@Override
	public String execute() throws Exception {
		System.out.println("execute().....");
		return SUCCESS ;
	}

}
