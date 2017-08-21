package com.springbootelastic.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.springbootelastic.bean.Twitter;

public interface TwitterRepository extends ElasticsearchRepository<Twitter, String> {

	
}
