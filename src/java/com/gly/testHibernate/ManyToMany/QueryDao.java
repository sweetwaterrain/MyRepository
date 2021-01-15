package com.gly.testHibernate.ManyToMany;

import com.gly.testHibernate.OneToMany.dao.DBUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class QueryDao {
    private Session session = null;
    public List<Stu> queryStudent()throws Exception{
        session = DBUtils.getSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from Stu";
        Query<Stu> query =  session.createQuery(hql,Stu.class);
        List<Stu> list = query.list();
        transaction.commit();
        session.close();
        return list;
    }
}
