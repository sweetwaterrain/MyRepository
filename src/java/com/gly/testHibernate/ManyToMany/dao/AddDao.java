package com.gly.testHibernate.ManyToMany.dao;

import com.gly.testHibernate.ManyToMany.Cours;
import com.gly.testHibernate.ManyToMany.Stu;
import com.gly.testHibernate.OneToMany.dao.DBUtils;
import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.util.Set;


public class AddDao extends ActionSupport {


    public String add(String name,String cour){
        Session session = DBUtils.getSession();
        Transaction ts = session.beginTransaction();


        Cours cours = new Cours();
        Stu stu = new Stu();

        stu.setS_name(name);
        cours.setC_name(cour);

        Set<Cours> c_set = stu.getC_set();
        c_set.add(cours);

        session.save(stu);
        session.save(cours);

        ts.commit();

        return SUCCESS;
    }
}
