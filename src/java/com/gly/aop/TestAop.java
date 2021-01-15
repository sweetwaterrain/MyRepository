package com.gly.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class TestAop {
    @Resource(name = "roleService")
    private RoleService roleService;

    @Test
    public void fun1() {
        roleService.add();
    }

    @Resource(name = "userService")
    private UserService userService;
    @Test
    public void fun2(){
        userService.add();
    }
}
