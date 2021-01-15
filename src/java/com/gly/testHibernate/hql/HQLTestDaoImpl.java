//package com.gly.testHibernate.hql;
//
//import com.gly.model.User;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.query.Query;
//
//import java.util.List;
//
//
//public class HQLTestDaoImpl {
//    public Session getSession(){
//        Configuration configuration = new Configuration().configure();
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        return sessionFactory.openSession();
//    }
//
//    public void test1(){
//        Session session = getSession();
//        String hql = "from User ";
//        Query query = session.createQuery(hql);
//        List<User> list = query.list();
//        session.close();
//        System.out.println(list.get(0).getName());
//    }
//
//    public void test2(){
//        Session session = getSession();
//        String hql = "from User where id = 1";
//        Query query = session.createQuery(hql);
//        User UesrEntity = (User)query.uniqueResult();
//        session.close();
//        System.out.println(UesrEntity);
//    }
//
//    public void test3(){
//        Session session = getSession();
//        String hql = "from User where id = :id";
//        Query query = session.createQuery(hql);
//        query.setParameter("id",1);
//        User UesrEntity = (User)query.uniqueResult();
//        session.close();
//        System.out.println(UesrEntity);
//    }
//
//    public void test4(){
//        Session session = getSession();
//        String hql = "from User";
//        Query query = session.createQuery(hql);
//        query.setFirstResult(1);
//        query.setMaxResults(1);
//        List<User> list = query.list();
//        session.close();
//        System.out.println(list);
//    }
//
//    public static void main(String[] args) {
//        new HQLTestDaoImpl().test1();
//    }
//}
