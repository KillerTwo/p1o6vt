package com.imooc.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.dto.User;
import com.imooc.dto.UserQueryCondition;

@RestController
public class UserController {
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public List<User> query(@RequestParam String username, UserQueryCondition userCondition,
			Pageable pageable) {
		System.err.println(pageable.getPageSize());
		System.err.println(pageable.getPageNumber());
		System.err.println(pageable.getOffset());
		System.err.println(pageable.getSort());
		System.out.println(userCondition);
		System.err.println("用户名是："+ username);
		List<User> users = new ArrayList<>();
		users.add(new User());
		users.add(new User());
		users.add(new User());
		return users;
	}
}
