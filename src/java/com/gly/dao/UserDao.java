//package com.gly.dao;
//
//import com.gly.model.User;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class UserDao {
//    private SessionFactory sessionFactory;
//    private Session session;
//    private Transaction transaction;
//
//    public UserDao(){
//        Configuration configuration = new Configuration().configure();
//        sessionFactory = configuration.buildSessionFactory();
//        session = sessionFactory.getCurrentSession();
//        transaction = session.beginTransaction();
//    }
//
//    public User getUser(Integer id){
//
//        User user = session.get(User.class,id);
//        transaction.commit();
//        return user;
//    }
//    public void saveUser(User user){
//        session.save(user);
//        System.out.println("======"+user.getName());
//        transaction.commit();
//
//    }
//}
