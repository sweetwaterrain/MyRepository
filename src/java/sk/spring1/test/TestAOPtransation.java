package sk.spring1.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sk.spring1.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context.xml")
public class TestAOPtransation {

	// 注入Service对象
	@Resource(name="accountService")
	private AccountService service ;

	public void setService(AccountService service) {
		this.service = service;
	}

	@Test
	public void t1(){
		Integer from = 1;
		Integer to = 2;
		Double money = 100d;
		service.account(from, to, money);
	}
}
