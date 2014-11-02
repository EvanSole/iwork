package com.vip.iwork.system.service;

import java.util.List;

import com.vip.iwork.common.page.Page;
import com.vip.iwork.system.entity.User;

public interface UserService {

	public User findUserById(Long userId);

	public List<User> findAllUser();

	public Page<User> findUser(Page<User> page);
	
}
