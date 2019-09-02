package com.hacks.devbackend.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hacks.devbackend.model.User;
import com.hacks.devbackend.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public int addUser(User user) {
		return userRepository.save(user).getUser_id();
	}

	public User getUser(int id) {
		List<User> users = new ArrayList<User>();
		userRepository.findAll().forEach(item -> users.add(item));
		return users.stream().filter(item -> item.getUser_id()==id).findAny().get();
	}

	public List<User> getUsers() {
		List<User> users = new ArrayList<User>();
		userRepository.findAll().forEach(item -> users.add(item));
		return users;
	}

}
