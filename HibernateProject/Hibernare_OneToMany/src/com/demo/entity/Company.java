package com.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author SaptakPatil
 *
 */
@Table
@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "companyname")
	private String companyName;
	@Column(name = "city")
	private String city;
	@Column(name = "country")
	private String country;

	//targetEntity = Product.class
	@OneToMany(cascade = CascadeType.ALL)
	private Product product;

	public Company() {
	}

	public Company(String companyName, String city, String country) {
		super();
		this.companyName = companyName;
		this.city = city;
		this.country = country;
	}

	public Company(long id, String companyName, String city, String country) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.city = city;
		this.country = country;
	}

	/**
	 * Getter
	 * 
	 * @param Setter
	 *
	 */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	// For one to one mapping
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	// To display on console
	public void displayCompany() {
		System.out.println("-- Compnay --");
		System.out.println("Id : " + id);
		System.out.println("Company Name : " + companyName);
		System.out.println("City : " + city);
		System.out.println("Country : " + country);
		System.out.println("-- Company Data Fetched ---");
	}

}
