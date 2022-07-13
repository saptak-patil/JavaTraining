package com.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @author SaptakPatil
 *
 */


@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long prodId;

	@NotNull
	@NotEmpty(message = "Product name required")
	@Column(name = "proname")
	private String prodName;

	@NotEmpty(message = "Product price required")
	@Column(name = "proprice")
	private String prodPrice;

	@NotEmpty(message = "Product colour required")
	@Column(name = "procolour")
	private String prodColour;

	@NotNull
	@NotEmpty(message = "Product department name require")
	@Column(name = "pro_dept")
	private String prodDept;

	@NotEmpty(message = "Product dept description required")
	@Column(name = "prodept_describe")
	private String prodDescription;

//	@Column(name = "deptid")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pro_dept_id")
	@JsonBackReference
	Department departments;

	/**
	 * default constructor
	 */
	public Product() {

	}

	/**
	 * @param prodName
	 * @param prodPrice
	 * @param prodColour
	 * @param prodDept
	 * @param prodDescription
	 */
	public Product(@NotNull @NotEmpty String prodName, String prodPrice, String prodColour,
			@NotNull @NotEmpty String prodDept, String prodDescription) {
//		super();
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodColour = prodColour;
		this.prodDept = prodDept;
		this.prodDescription = prodDescription;
	}

	/**
	 * @param prodId
	 * @param prodName
	 * @param prodPrice
	 * @param prodColour
	 * @param prodDept
	 * @param prodDescription
	 */
//	public Product(long prodId, @NotNull @NotEmpty String prodName, String prodPrice, String prodColour,
//			@NotNull @NotEmpty String prodDept, String prodDescription) {
//		super();
//		this.prodId = prodId;
//		this.prodName = prodName;
//		this.prodPrice = prodPrice;
//		this.prodColour = prodColour;
//		this.prodDept = prodDept;
//		this.prodDescription = prodDescription;
//	}

	/**
	 * @return the prodId
	 */
	public long getProdId() {
		return prodId;
	}

	/**
	 * @param prodId the prodId to set
	 */
	public void setProdId(long prodId) {
		this.prodId = prodId;
	}

	/**
	 * @return the prodName
	 */
	public String getProdName() {
		return prodName;
	}

	/**
	 * @param prodName the prodName to set
	 */
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	/**
	 * @return the prodPrice
	 */
	public String getProdPrice() {
		return prodPrice;
	}

	/**
	 * @param prodPrice the prodPrice to set
	 */
	public void setProdPrice(String prodPrice) {
		this.prodPrice = prodPrice;
	}

	/**
	 * @return the prodColour
	 */
	public String getProdColour() {
		return prodColour;
	}

	/**
	 * @param prodColour the prodColour to set
	 */
	public void setProdColour(String prodColour) {
		this.prodColour = prodColour;
	}

	/**
	 * @return the prodDept
	 */
	public String getProdDept() {
		return prodDept;
	}

	/**
	 * @param prodDept the prodDept to set
	 */
	public void setProdDept(String prodDept) {
		this.prodDept = prodDept;
	}

	/**
	 * @return the prodDescription
	 */
	public String getProdDescription() {
		return prodDescription;
	}

	/**
	 * @param prodDescription the prodDescription to set
	 */
	public void setProdDescription(String prodDescription) {
		this.prodDescription = prodDescription;
	}

	/**
	 * @return the departments
	 */
	public Department getDepartments() {
		return departments;
	}

	/**
	 * @param departments the departments to set
	 */
	public void setDepartments(Department departments) {
		this.departments = departments;
	}

}