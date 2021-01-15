package com.gly.testHibernate.ManyToMany.action;

import com.gly.testHibernate.ManyToMany.Cours;
import com.gly.testHibernate.ManyToMany.dao.QueryDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.*;

public class ShowAction extends ActionSupport {
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
}
