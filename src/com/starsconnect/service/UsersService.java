package com.starsconnect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starsconnect.dao.User;
import com.starsconnect.dao.UsersDao;

@Service("usersService")
public class UsersService {
	
	@Autowired
	private UsersDao usersDao;
	
	public void saveOrUpdateUser(User user) {
		usersDao.saveOrUpate(user);
	}

	public List<User> getAllUsers() {
		return usersDao.getUsers();
	}

}
