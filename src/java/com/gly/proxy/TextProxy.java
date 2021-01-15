package com.gly.proxy;

import java.lang.reflect.Proxy;

public class TextProxy {
    public static void main(String[] args) {
        // 委托人
        Subject realSubject = new RealSubject();

        // 代理人
        InvocationProxy invocationProxy = new InvocationProxy(realSubject);

        Subject proxyRealSubject =
                (Subject) Proxy.newProxyInstance(
                        realSubject.getClass().getClassLoader(),
                        realSubject.getClass().getInterfaces(),
                        invocationProxy);
        proxyRealSubject.doSomething();
    }
}
