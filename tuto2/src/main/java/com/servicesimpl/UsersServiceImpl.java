package com.servicesimpl;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daoapi.UsersDao;
import com.entities.Users;
import com.servicesapi.UsersService;

public class UsersServiceImpl implements UsersService {
	
	private static final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	private static final UsersDao usersDao = (UsersDao)context.getBean("UsersDao");

	public boolean saveOrUpdate(Users users) {
		return usersDao.saveOrUpdate(users);
	}

	public List<Users> list() {
		return usersDao.list();
	}

	public boolean delete(Users users) {
		return usersDao.delete(users); 
	}
}
