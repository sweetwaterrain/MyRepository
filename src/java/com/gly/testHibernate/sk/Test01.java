package com.gly.testHibernate.sk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Test01 {
    //    factory.openSession提供会话对象，不能处理事务
    static Session session = null;

    public static void getSession(){
        Configuration config = new Configuration().configure();
        SessionFactory factory = config.buildSessionFactory();
        session = factory.openSession();
    }

    public static void close(){
        if (session != null){
            session.close();
        }
    }

    public static void findOne(){
        getSession();
        Bank bankEntity = session.find(Bank.class,1);
        System.out.println(bankEntity);
    }

    public static void findUser(){
        getSession();
        Bank userEntity = session.find(Bank.class,1);
        System.out.println(userEntity);
    }

    public static void findList(){
        getSession();
        Query query = session.createQuery("from Bank");
        List<Bank> resultList = query.getResultList();
        System.out.println(resultList);
        close();
    }

    public static void add(){
        getSession();
        Bank be = new Bank();
        be.setId(5);
        be.setName("hello");
        be.setMoney(1222);
        Transaction transaction = session.beginTransaction();
        session.save(be);
        transaction.commit();
        close();
    }

    public static void upd(){
        getSession();
        Bank be = session.load(Bank.class,5);
        be.setMoney(2444);
        Transaction transaction = session.beginTransaction();
        session.update(be);
        transaction.commit();
        close();
    }

    public static void del(){
        getSession();
        Bank be = session.load(Bank.class,5);
        Transaction transaction = session.beginTransaction();
        session.delete(be);
        transaction.commit();
        close();
    }

    public static void main(String[] args) {
       findOne();
    }
}
