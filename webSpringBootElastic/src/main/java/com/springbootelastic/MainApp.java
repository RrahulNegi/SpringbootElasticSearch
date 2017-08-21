package com.springbootelastic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

import com.springbootelastic.bean.User;
import com.springbootelastic.service.UserService;


//@SpringBootApplication

public class MainApp {//implements CommandLineRunner{

/*	@Autowired
	ElasticsearchOperations es;
	
	@Autowired
	UserService schoolSer;
	
	public static void main(String args[]) {
        SpringApplication.run(MainApp.class, args);
    }


	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("IN RUNNNNNN");
        printElasticSearchInfo();


		// TODO Auto-generated method stub
		schoolSer.addUser(new User("1001", "Rahul",60000,"Java"));
		
		


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

*/
}

