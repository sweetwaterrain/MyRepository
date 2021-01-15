package com.gly.TestStruts.intercepter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.sun.xml.bind.v2.runtime.unmarshaller.Intercepter;

import java.util.Map;


public class MyIntercepter extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		 /*
		    拦截器放行 如果拦截器链没有执行完，则进入下一个拦截器，如果当前
		    拦截器是链上的最后一个拦截器，则进入action
		 */
		String result1 = "to_Login";
		System.out.println("myintercepter invoke");

		Map<String, Object> session = ActionContext.getContext().getSession();
		if(session.containsKey("user") ){
			if(session.get("user") != null) {
				return invocation.invoke();
			}
		}
		return result1;
	}
}
