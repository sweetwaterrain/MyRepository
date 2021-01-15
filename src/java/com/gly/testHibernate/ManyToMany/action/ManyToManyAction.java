package com.gly.testHibernate.ManyToMany.action;

import com.gly.testHibernate.ManyToMany.Cours;
import com.gly.testHibernate.ManyToMany.Stu;
import com.gly.testHibernate.ManyToMany.dao.AddDao;
import com.gly.testHibernate.ManyToMany.dao.QueryDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.hibernate.Hibernate;

import java.util.*;


public class ManyToManyAction extends ActionSupport implements ModelDriven<Stu_Cour> {
    private Stu_Cour stu_cour = new Stu_Cour();

    public String HQ(){

        String cour =  stu_cour.getCour();
        String name =  stu_cour.getName();

//        System.out.println(name + ";" + cour);
        AddDao addDao = new AddDao();
        String result =  addDao.add(name,cour);
//        System.out.println(result);
        return result;
    }

    public String CX(){
        String name = stu_cour.getName();
        String cour = stu_cour.getCour();
        QueryDao queryDao = new QueryDao();

        List<Stu_Cour> stuCourList = queryDao.Query(name,cour);

        String result = ERROR;
        Map<String, Object> session = ActionContext.getContext().getSession();

        if (!stuCourList.isEmpty()){
            result = SUCCESS;
            session.put("stu_cour",stuCourList);
        }
        return result;
    }

    public String QueryAll(){
        QueryDao queryDao = new QueryDao();
        List FinList = new ArrayList();

        List<Stu_Cour> stuCourList = queryDao.QueryList();

        if (!stuCourList.isEmpty()){
            for (int i = 0;i<stuCourList.size();i++){

                List list = new ArrayList();
                Stu_Cour stu_cour1 = stuCourList.get(i);
                String name = stu_cour1.getName();
                list.add(0,name);
                Set<Cours> cours = stu_cour1.getCours();
                Iterator iter = cours.iterator();
                for (Iterator it = iter; it.hasNext(); ) {
                    Cours cours_x = (Cours) iter.next();
                    int j=1;
                    String cour = cours_x.getC_name();
                    list.add(j,cour);
                    j = j+1;
                }
                FinList.add(i,list);

            }
        }

        String result = ERROR;
        Map<String, Object> session = ActionContext.getContext().getSession();

        if (!stuCourList.isEmpty()){
            result = SUCCESS;
            session.put("stu_cour",FinList);
        }
        return result;
    }

    @Override
    public Stu_Cour getModel() {
        return stu_cour;
    }

//    public static void main(String[] args) {
//        new ManyToManyAction().QueryAll();
//    }
}
