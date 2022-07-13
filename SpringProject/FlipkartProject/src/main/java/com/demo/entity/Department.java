package com.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author SaptakPatil
 *
 */
@Entity
@Table(name = "department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long deptId;

	@NotNull
	@NotEmpty(message = "Department name required")
	@Column(name = "deptname")
	private String deptName;


	@NotEmpty(message = "Department details required")
	@Column(name = "deptdetails")
	private String deptDetails;


	@NotEmpty(message = "Department email required")
	@Column(name = "deptemail")
	private String deptEmail;

//	@Column(name = "pro_dept_id")
//	@ElementCollection
	//targetEntity = Department.class
	// mappedBy = "department", fetch = FetchType.LAZY
	@OneToMany(cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Product> products;

	/**
	 * default constructor
	 */
	public Department() {
	}

	/**
	 * @param deptName
	 * @param deptDetails
	 * @param deptEmail
	 */
	public Department(@NotNull @NotEmpty String deptName, String deptDetails, String deptEmail) {
//		super();
		this.deptName = deptName;
		this.deptDetails = deptDetails;
		this.deptEmail = deptEmail;
	}

	/**
	 * @param deptId
	 * @param deptName
	 * @param deptDetails
	 * @param deptEmail
	 */
//	public Department(long deptId, @NotNull @NotEmpty String deptName, String deptDetails, String deptEmail) {
////		super();
//		this.deptId = deptId;
//		this.deptName = deptName;
//		this.deptDetails = deptDetails;
//		this.deptEmail = deptEmail;
//	}

	/**
	 * @return the deptId
	 */
	public long getDeptId() {
		return deptId;
	}

	/**
	 * @param deptId the deptId to set
	 */
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/**
	 * @return the deptDetails
	 */
	public String getDeptDetails() {
		return deptDetails;
	}

	/**
	 * @param deptDetails the deptDetails to set
	 */
	public void setDeptDetails(String deptDetails) {
		this.deptDetails = deptDetails;
	}

	/**
	 * @return the deptEmail
	 */
	public String getDeptEmail() {
		return deptEmail;
	}

	/**
	 * @param deptEmail the deptEmail to set
	 */
	public void setDeptEmail(String deptEmail) {
		this.deptEmail = deptEmail;
	}

	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}

}