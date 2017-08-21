package com.springbootelastic;

import java.util.Map;

import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
@SpringBootApplication

public class MainWebApp extends SpringBootServletInitializer {
	@Autowired
	ElasticsearchOperations es;
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		//printElasticSearchInfo();
		return application.sources(MainWebApp.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MainWebApp.class, args);
	}

	 private void printElasticSearchInfo() {

	        System.out.println("--ElasticSearch--");
	        Client client = es.getClient();
	        Map<String, String> asMap = client.settings().getAsMap();

	        asMap.forEach((k, v) -> {
	            System.out.println(k + " = " + v);
	        });
	        System.out.println("--ElasticSearch--");
	    }
}
