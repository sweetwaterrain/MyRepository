package com.gly.testSpring.test;

import com.gly.testSpring.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {
    public void getBeans(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-context.xml");
//        Car car = (Car) applicationContext.getBean("car");
//        car.setName("jm");
//        car.setColor("red");
//
//        System.out.println("Name:"+car.getName()+"; Color:"+car.getColor());
    }

    public static void main(String[] args) {
        new test01().getBeans();
    }
}
