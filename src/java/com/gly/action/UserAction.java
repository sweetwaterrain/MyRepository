//package com.gly.action;
//
//import com.gly.dao.UserDao;
//import com.gly.model.User;
//import com.opensymphony.xwork2.ActionContext;
//import com.opensymphony.xwork2.ActionSupport;
//
//
//import java.util.Map;
//
//
//public class UserAction extends ActionSupport{
//
//    public String m1(){
//
//
//
//
//        UserDao userDao = new UserDao();
//        User user = userDao.getUser(1);
//
//        System.out.println(user.getName());
//
//        Map<String, Object> session = ActionContext.getContext().getSession();
//
//        session.put("users",user);
//
////        User user1 = (User) session.get("users");
////        System.out.println(user1.getName());
//        return "success";
//    }
//    public String saveUser(){
//        UserDao userDao = new UserDao();
//        User user = new User();
//        user.setName("事务提交");
//        userDao.saveUser(user);
//        return SUCCESS;
//    }
//}
