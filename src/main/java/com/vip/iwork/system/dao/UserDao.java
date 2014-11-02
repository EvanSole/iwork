package com.vip.iwork.system.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vip.iwork.common.page.Page;
import com.vip.iwork.system.entity.User;

@Repository
public interface UserDao {

	public User findUserById(Long userId);

	public List<User> findAllUser();

	public Page<User> findUser(Page<User> page);

}
