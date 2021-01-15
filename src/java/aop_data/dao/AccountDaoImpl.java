package aop_data.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    @Override
    public void addMoney(Integer id, Double money) {
        getJdbcTemplate().update("update tx set money = money + ? where id = ?",money,id);
    }

    @Override
    public void decreaseMoney(Integer id, Double money) {
        getJdbcTemplate().update("update tx set money = money - ? where id = ?",money,id);
    }
}
