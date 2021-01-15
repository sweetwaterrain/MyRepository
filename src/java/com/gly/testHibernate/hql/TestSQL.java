//package com.gly.testHibernate.hql;
//
//import com.gly.model.User;
//import com.gly.testHibernate.OneToMany.dao.DBUtils;
//import org.hibernate.Session;
//import org.hibernate.query.NativeQuery;
//
//import java.util.List;
//
//
//public class TestSQL {
//    public static void fun1(){
//        Session session = DBUtils.getSession();
//
//        String sql = "select * from user where id = ?";
//
//        NativeQuery<User> nativeQuery = session.createSQLQuery(sql).addEntity(User.class);
//        nativeQuery.setParameter(1,1);
//        User user = nativeQuery.uniqueResult();
//
//        System.out.println(user);
//
//        session.close();
//    }
//
//    public static void main(String[] args) {
//        fun1();
//    }
//}
