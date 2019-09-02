package com.hacks.devbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.hacks.devbackend.model.User;
import com.hacks.devbackend.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	public int addUser(User user) {
		return userService.addUser(user);
	}

	public User getUser(int id) {
		return userService.getUser(id);
	}
}
