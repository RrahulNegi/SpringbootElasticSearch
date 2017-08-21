package com.springbootelastic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootelastic.bean.User;
import com.springbootelastic.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {

	UserRepository userRepo;

	@Autowired
	public void setUserRepo(UserRepository userRepo) {
		this.userRepo = userRepo;
	}


	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		userRepo.delete(user);

	}


	@Override
	public User findOne(String id) {
		// TODO Auto-generated method stub
		return userRepo.findOne(id);
	}


	@Override
	public List<User> findByName(String name) {
		// TODO Auto-generated method stub
		return userRepo.findByName(name);
	}

}
