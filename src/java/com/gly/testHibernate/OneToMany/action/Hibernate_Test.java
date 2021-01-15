package com.gly.testHibernate.OneToMany.action;

import com.gly.testHibernate.OneToMany.dao.DBUtils;
import com.gly.testHibernate.OneToMany.entity.Hstudent;
import com.gly.testHibernate.OneToMany.entity.Huser;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

public class Hibernate_Test {

    public void test1() throws Exception {
        Session session = DBUtils.getSession();
        // 数据准备
        Hstudent stu1 = new Hstudent();
        stu1.setSid(3);
        stu1.setSname("xiaolan");

        Set<Huser> userSet = new HashSet<>();

        Huser user1 = new Huser();
        user1.setUid(5);
        user1.setUname("xl123");
        user1.setSid(3);
        user1.setStudent(stu1);

        Huser user2 = new Huser();
        user2.setUid(6);
        user2.setUname("xl321");
        user2.setSid(3);
        user2.setStudent(stu1);

        userSet.add(user1);
        userSet.add(user2);

        stu1.setUserSet(userSet);

        Transaction ts = session.beginTransaction();
        session.save(user1);
        session.save(user2);
        session.save(stu1);

        ts.commit();
        session.close();
    }

    public static void main(String[] args) throws Exception{
        new Hibernate_Test().test1();
    }
}