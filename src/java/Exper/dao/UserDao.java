package Exper.dao;

import Exper.entity.User;
import Exper.tools.DButils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public List<User> JudgmentLogin(User user){
        String username = user.getUsername();
        String password = user.getPassword();
        String result = "error";
        List list = new ArrayList();
        if (username!=null && password!=null){
            Session session = DButils.getSession();
            Transaction ts = session.beginTransaction();
            String hql = "from User where username=?1 and password=?2";
            Query query = session.createQuery(hql);
            query.setParameter(1,username);
            query.setParameter(2,password);
            list = query.list();

            ts.commit();
            session.close();
            if (!list.isEmpty()){
                return list;
            }else {
                return list;
            }
        }
        return list;
    }
}
