package com.vip.iwork.system.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vip.iwork.system.entity.User;


@Controller
@RequestMapping(value = "/user", produces = {"application/json", "application/xml"})
public class UserController {
	
	/**
	 * 保存用户
	 * @return
	 */
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@RequestBody User user){
		
		return "";
	}
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
    @RequestMapping(value = "/{id}",method=RequestMethod.GET)
    public ResponseEntity<User> findUserById(@PathVariable long id) {
        return null;
    }
}
