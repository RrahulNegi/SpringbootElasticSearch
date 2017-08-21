package com.springbootelastic.bean;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
@Document(indexName = "userdata", type = "private")
public class User implements Serializable{
@Id
	private String id;
	private String name;
	private long salary;
	private String department;
	
	/*public User(String id, String name, long salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}*/
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
