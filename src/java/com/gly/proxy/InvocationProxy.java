package com.gly.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationProxy implements InvocationHandler {
    protected Subject subject;

    public InvocationProxy(Subject subject) {
        this.subject = subject;
    }

    /*
        proxy :  委托对象
        method : 委托方法
        args :   委托方法参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用委托方法之前");
        Object result = method.invoke(subject,args);
        System.out.println("调用委托方法之后");
        return result ;
    }
}
