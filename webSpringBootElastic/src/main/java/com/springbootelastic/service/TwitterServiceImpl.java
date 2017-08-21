package com.springbootelastic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootelastic.bean.Twitter;
import com.springbootelastic.repository.TwitterRepository;

@Service("twitterService")
public class TwitterServiceImpl implements TwitterService{
@Autowired
	TwitterRepository twitterRepository;
	
	

	@Override
	public Twitter addTwitter(Twitter twitter) {
		// TODO Auto-generated method stub
		return twitterRepository.save(twitter);
	}

}
