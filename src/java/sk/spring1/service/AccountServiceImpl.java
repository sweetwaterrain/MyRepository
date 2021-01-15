package sk.spring1.service;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import sk.spring1.dao.AccountDao;
public class AccountServiceImpl implements AccountService{

	// 注入dao对象到service层
	@Resource(name="accountDao")
	private AccountDao dao;

	public void setDao(AccountDao dao) {
		this.dao = dao;
	}

	/**
	 * from : 转出
	 * to : 转入
	 * money : 转账金额
	 *
	 * 事务管理的主要方法：切面  pointcut : 切入点 + 通知
	 */

	public void account(Integer from, Integer to, Double money) {
		// 转出
		dao.decreaseMoney(from, money);

//		int a = 1/0; // Exception

		// 转入
		dao.addMoney(to, money);
	}

}
