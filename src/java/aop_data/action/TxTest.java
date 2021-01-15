package aop_data.action;


import aop_data.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context.xml")
public class TxTest {
    @Resource(name = "accountService")
    private AccountService service;

    public void setService(AccountService service) {
        this.service = service;
    }
    @Test
    public void t1(){
        Integer from =1;
        Integer to =2;
        Double money =100d;
        service.account(from,to,money);
    }

}
