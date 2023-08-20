package com.stu.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;


@Entity
public class Candidate 
{
	@Id
	private int id;
	private String name;
	private String type;
	private String category;
	private String manufacturer;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}



	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	

	public Candidate(int id, String name, String type, String category, String manufacturer) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.category = category;
		this.manufacturer = manufacturer;

	}


	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
