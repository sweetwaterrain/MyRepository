package Exper.dao;

import Exper.entity.Goods;
import Exper.tools.DButils;
import com.opensymphony.xwork2.ActionContext;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Map;

public class GoodsDao {


    public List<Goods> list() {
        Session session = DButils.getSession();
        Transaction ts = session.beginTransaction();
        String hql = "from Goods ";
        Query query = session.createQuery(hql);
        List resultList = query.list();

//        System.out.println(resultList);

        return resultList;
    }
}
