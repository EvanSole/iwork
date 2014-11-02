package com.vip.iwork.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vip.iwork.common.page.Page;
import com.vip.iwork.system.dao.UserDao;
import com.vip.iwork.system.entity.User;
import com.vip.iwork.system.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User findUserById(Long userId) {
		return userDao.findUserById(userId);
	}

	@Override
	public List<User> findAllUser() {
		return userDao.findAllUser();
	}

	@Override
	public Page<User> findUser(Page<User> page) {
		return userDao.findUser(page);
	}

}
