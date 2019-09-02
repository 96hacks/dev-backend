package com.hacks.devbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.hacks.devbackend.model.User;
import com.hacks.devbackend.service.UserService;

@RestController
@RequestMapping(value = "user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public int addUser(User user) {
		return userService.addUser(user);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public User getUser(int id) {
		return userService.getUser(id);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/all")
	public List<User> getUsers() {
		return userService.getUsers();
	}
}
