package com.gly.testHibernate.ManyToMany.dao;

import com.gly.testHibernate.DBUtils;
import com.gly.testHibernate.ManyToMany.Cours;
import com.gly.testHibernate.ManyToMany.Stu;
import com.gly.testHibernate.ManyToMany.action.Stu_Cour;
import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class QueryDao extends ActionSupport {

    public List<Stu_Cour> Query(String name,String cour){
        Session session = DBUtils.getSession();
        List<Stu_Cour> list = new ArrayList();

        String hql = "from Stu,Cours where s_name = ?1 and c_name = ?2 ";

        Query query = session.createQuery(hql)  ;

        query.setParameter(1,name);
        query.setParameter(2,cour);
        List<Object> s_c = query.getResultList();

        if (s_c!=null){
            for (int i = 0;i < s_c.size() ; i++){
                Object[] obj = (Object[]) s_c.get(i);

                Stu stu = (Stu) obj[0];
                Cours cours = (Cours) obj[1];
                Stu_Cour stu_cour = new Stu_Cour();

//            Map<String, String> map = new HashMap();

                stu_cour.setName(stu.getS_name());
                stu_cour.setCour(cours.getC_name());

                list.add(i,stu_cour);

            }
        }
        session.close();
        return list;
    }

    public List<Stu_Cour> QueryList(){

        Session session = DBUtils.getSession();

        List<Stu_Cour> list = new ArrayList<>();

        String hql = "from Stu";
        Query query = session.createQuery(hql);

        List<Stu> stuCourList = query.list();

        if (!stuCourList.isEmpty()){
            for (int i = 0;i < stuCourList.size();i++){
                Stu_Cour stu_cour = new Stu_Cour();
                String s_name = stuCourList.get(i).getS_name();
                Set<Cours> c_set = stuCourList.get(i).getC_set();
                stu_cour.setName(s_name);
                stu_cour.setCours(c_set);

                list.add(i,stu_cour);
            }
        }

        //session.close();
        return list;
    }

//    public static void main(String[] args) {
//        List list = new QueryDao().QueryList();
////        Stu_Cour stu_cour = (Stu_Cour) list.get(0);
////        System.out.println(stu_cour.getName()+";"+stu_cour.getCour());
//    }
}
