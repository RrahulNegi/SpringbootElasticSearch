package com.springbootelastic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootelastic.bean.Twitter;
import com.springbootelastic.bean.User;
import com.springbootelastic.service.TwitterService;
import com.springbootelastic.service.UserService;

@RestController
public class MainController  {
	@Autowired
	UserService userService;
	
	@Autowired
	TwitterService twitterService;
	
	@RequestMapping(value="/addUser",  method = RequestMethod.POST)
	@ResponseBody
	public User addUser(@RequestBody User user){
		System.out.println(user.getDepartment()+" :: "+user.getSalary());
		User userData=userService.addUser(user);
		return userData;
	}
	
	@RequestMapping(value="/findOneUser/{id}",  method = RequestMethod.GET)
	@ResponseBody
	public User findOneUser(@PathVariable String id){
		return userService.findOne(id);
		
	}
	
	@RequestMapping(value="/findByName/{name}",  method = RequestMethod.GET)
	@ResponseBody
	public List<User> findByName(@PathVariable String name){
		return userService.findByName(name);
		
	}

	
	@RequestMapping(value="/addTwitter",  method = RequestMethod.POST)
	@ResponseBody
	public Twitter addTwitter(@RequestBody Twitter twitter){
		Twitter twite=twitterService.addTwitter(twitter);
		return null;
	}
}
