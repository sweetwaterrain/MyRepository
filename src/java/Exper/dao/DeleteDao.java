package Exper.dao;

import Exper.entity.Goods;
import Exper.tools.DButils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class DeleteDao {
    public void Delete(String gname){

        if (gname!=null){
            Session session = DButils.getSession();
            Transaction ts = session.beginTransaction();
            String hql = "from Goods WHERE gname = ?1";
            Query  query = session.createQuery(hql);
            query.setParameter(1,gname);
            List<Goods> list = query.list();
            System.out.println(list.get(0));
            session.delete(list.get(0));
            ts.commit();
            session.close();
        }
    }
}
