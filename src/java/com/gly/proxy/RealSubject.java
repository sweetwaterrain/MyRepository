package com.gly.proxy;

public class RealSubject implements Subject{

    @Override
    public String doSomething() {
        System.out.println("do some thing..");
        return "do some thing..";
    }
}
