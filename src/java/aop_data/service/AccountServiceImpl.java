package aop_data.service;

import aop_data.dao.AccountDao;

import javax.annotation.Resource;

public class AccountServiceImpl implements AccountService {
    @Resource(name = "accountDao")
    private AccountDao dao;

    public void setDao(AccountDao dao){
        this.dao = dao;
    }

    @Override
    public void account(Integer from, Integer to, Double money) {
        dao.decreaseMoney(from,money);
        dao.addMoney(to,money);
    }
}
