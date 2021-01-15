package Exper.action;

import Exper.dao.GoodsDao;
import Exper.dao.UserDao;
import Exper.entity.Goods;
import Exper.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.List;
import java.util.Map;

public class BaseAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();
    public String login(){
        UserDao userDao = new UserDao();
        List<User> users = userDao.JudgmentLogin(user);
        if (!users.isEmpty()){
            return SUCCESS;
        }else {
            return ERROR;
        }
    }

    public String show(){
        GoodsDao goodsDao = new GoodsDao();
        List<Goods> goodsList = goodsDao.list();
        if (!goodsList.isEmpty()){
//            System.out.println(goodsList);
            Map<String, Object> objectMap = ActionContext.getContext().getSession();
            objectMap.put("goodsList",goodsList);
            System.out.println(goodsList);
            return SUCCESS;
        }else {
            return ERROR;
        }
    }


    @Override
    public User getModel() {
        return user;
    }
}
