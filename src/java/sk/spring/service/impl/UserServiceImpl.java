package sk.spring.service.impl;

import org.springframework.stereotype.Service;

import sk.spring.service.UserService;


/**
 * 在service 通过动态代理管理事务
 */
@Service("userService")
public class UserServiceImpl {

	public void add() {
		System.out.println("添加");
	}

	public void del() {
		System.out.println("删除");
	}

	public void upd() {
		System.out.println("更新");
	}

	public void find() {
		System.out.println("查找");
	}

}
