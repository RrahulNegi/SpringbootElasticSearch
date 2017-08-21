package com.springbootelastic.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.springbootelastic.bean.User;

public interface UserRepository extends ElasticsearchRepository<User, String> {
	
	List<User>findByName(String name);

}
