package com.gly.testHibernate.ManyToMany;

import com.gly.testHibernate.OneToMany.dao.DBUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Set;


public class fun1 {

    public static void main(String[] args) {
        Session session = DBUtils.getSession();
        Transaction ts = session.beginTransaction();

        Stu s1 = new Stu();
        s1.setS_name("顾龙雨");
//        Stu s2 = new Stu();
//        s2.setS_name("赵鸡毛");

        Cours c1 = new Cours();
        c1.setC_name("Java从入门到放弃");
//        Cours c2 = new Cours();
//        c2.setC_name("演员的自我修养");

        Set<Cours> c_set = s1.getC_set();
        c_set.add(c1);
//        c_set.add(c2);

//        Set<Cours> c_set2 = s2.getC_set();
//        c_set2.add(c1);
//        c_set2.add(c2);

        session.save(s1);
//        session.save(s2);
        session.save(c1);
//        session.save(c2);

        ts.commit();

    }
}
