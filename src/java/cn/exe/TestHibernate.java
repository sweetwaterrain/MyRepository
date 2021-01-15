package cn.exe;


import Exper.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestHibernate {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    @Test
    public void test01(){
        Session session = sessionFactory.openSession();
        Transaction ts = session.beginTransaction();
        User user = new User();
        user.setUsername("111");
        session.save(user);
        ts.commit();
        session.close();
    }
}
