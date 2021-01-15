package Exper.dao;

import Exper.entity.Goods;
import Exper.tools.DButils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddDao {

    public void Add(Goods goods){
        String gname = goods.getGname();
        Double price = goods.getPrice();
        if (gname!=null && price!=null){
            Session session = DButils.getSession();
            Transaction ts = session.beginTransaction();
            session.save(goods);
            ts.commit();
            session.close();
        }
    }
}
