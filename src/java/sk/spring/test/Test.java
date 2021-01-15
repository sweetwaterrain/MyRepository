package sk.spring.test;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sk.spring.service.impl.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context.xml")
public class Test {
	
	@Resource(name="userService")
	private UserServiceImpl service ;
	
	@org.junit.Test
	public void fun1 () {
		service.add();
	}
}
