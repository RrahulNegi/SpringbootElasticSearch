package com.springbootelastic.service;

import java.util.List;

import com.springbootelastic.bean.User;

public interface UserService {
	
	public User addUser(User user);
	public void deleteUser(User user);
	public User findOne(String id);
	public List<User>findByName(String name);

}
