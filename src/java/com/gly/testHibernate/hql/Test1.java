//package com.gly.testHibernate.hql;
//
//import com.gly.model.User;
//import org.hibernate.Criteria;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.hibernate.criterion.Restrictions;
//
//import java.util.List;
//
//public class Test1 {
//    public static void function1(){
//        Session session = new HQLTestDaoImpl().getSession();
//        Transaction tx = session.beginTransaction();
//
//        Criteria criteria = session.createCriteria(User.class);
//        criteria.add(Restrictions.lt("id",3));
//        List<User> list  = criteria.list();
//        System.out.println(list);
//
//        tx.commit();
//        session.close();
//    }
//
//    public static void main(String[] args) {
//        function1();
//    }
//}
