package sk.spring1.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	/**
	 * 被转账方增加余额
	 */
	public void addMoney(Integer id, Double money) {
		getJdbcTemplate().update("update account set money = money + ? where id = ?" , money , id);
	}

	/**
	 * 转账方减少余额
	 */
	public void decreaseMoney(Integer id, Double money) {
		getJdbcTemplate().update("update account set money = money - ? where id = ?" , money , id);
	}

}
