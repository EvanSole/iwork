package com.vip.iwork.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vip.iwork.system.entity.User;
import com.vip.iwork.system.service.UserService;

@Controller
@RequestMapping(value = "/user", produces = { "application/json","application/xml" })
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String findUserById(@PathVariable long id) {
		User user = userService.findUserById(id);
		System.out.println(userService+"----------");
		return "user/userlist";
	}
}
