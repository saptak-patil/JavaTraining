package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "product")
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "name")
	private String name;


	@Column(name = "brand")
	private String brand;
	@Column(name = "description")
	private String description;
	@Column(name = "colour")
	private String colour;
	@Column(name = "cost")
	private String cost;

	public Product() {}
	
	public Product(String name, String brand, String description, String colour, String cost) {
		super();
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.colour = colour;
		this.cost = cost;
	}

	/**
	 * Getter Setters For Entity Class data elements
	 * 
	 * @return
	 */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public void displayProduct() {
		System.out.println("-- Product");
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Brand : " + brand);
		System.out.println("Description : " + description);
		System.out.println("Colour : " + colour);
		System.out.println("Cost : " + cost);
		System.out.println("-- Product Data Fetched ---");
	}
}
