package com.gly.testSpring.DI;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/application-context.xml")

public class test02 {
    public void testDI(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("application-context.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println("id:"+student.getId()+" ;name:"+student.getName()+" ;username:"+student.getUser().getUsername());
    }
    public void testDI2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("application-context.xml");
        Student student = (Student) ac.getBean("student2");
        System.out.println("id:"+student.getId()+" ;name:"+student.getName()+" ;username:"+student.getUser().getUsername());
    }
    public void testDI3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("application-context.xml");
        Student student = (Student) ac.getBean("student3");
        System.out.println("id:"+student.getId()+" ;name:"+student.getName()+" ;username:"+student.getUser().getUsername());
    }
    public void testDI4(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("application-context.xml");
        Order order = (Order) ac.getBean("order");
        String[] strs = order.getArray();
        List<String> list = order.getList();
        Map<String, String> map = order.getMap();
        for (String s : strs){
            System.out.println(s);
        }
        for (String s : list){
            System.out.println(s);
        }
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext() == true){
            Map.Entry<String, String> entry = it.next();
            System.out.println("key:" + entry.getKey() + "; value:" + entry.getValue());
        }
    }

    @Autowired
    @Qualifier("User")
    private User user;

    @Test
    public void TestComp(){
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        User user = (User) ac.getBean("user");
        System.out.println(user);
    }
    public static void main(String[] args) {
//        new test().testDI();
//        new test().testDI2();
//        new test().testDI3();
//        new test().testDI4();
        new test02().TestComp();
    }
}

