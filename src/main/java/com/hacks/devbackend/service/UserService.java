package com.hacks.devbackend.service;

import java.util.List;
import com.hacks.devbackend.model.User;

public interface UserService {
	public int addUser(User user);

	public User getUser(int id);

	public List<User> getUsers();
}
