package com.gly.testSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test01 (){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        People p1 = (People)context.getBean("p1");

        System.out.println(p1);

    }

    @org.junit.Test
    public void test02 (){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        People p2 = (People)context.getBean("p2");

        System.out.println(p2);

    }

    @org.junit.Test
    public void test03 (){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        People p3 = (People)context.getBean("p3");

        System.out.println("p3 ---> " + p3);

    }
}
