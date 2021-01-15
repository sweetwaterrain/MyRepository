package aop_data.dao;

public interface AccountDao {
     void addMoney(Integer id, Double money);
     void decreaseMoney(Integer id, Double money);
}
