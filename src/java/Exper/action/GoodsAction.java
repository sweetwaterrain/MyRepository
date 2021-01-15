package Exper.action;

import Exper.dao.AddDao;
import Exper.dao.DeleteDao;
import Exper.dao.GoodsDao;
import Exper.entity.Goods;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class GoodsAction extends ActionSupport implements ModelDriven<Goods> {
    private Goods goods = new Goods();

    public String add(){
        goods.getGname();
        goods.getPrice();
        AddDao addDao = new AddDao();
        addDao.Add(goods);

//        System.out.println(goods);
        return SUCCESS;
    }

    public String delete(){
        String gname = goods.getGname();
        DeleteDao deleteDao = new DeleteDao();
        deleteDao.Delete(gname);
        return SUCCESS;
    }

    @Override
    public Goods getModel() {
        return goods;
    }
}
