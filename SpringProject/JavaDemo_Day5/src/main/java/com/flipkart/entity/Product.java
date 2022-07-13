package com.flipkart.entity;

public class Product {

	private long prodId;
	private String prodName;
	private String prodPrice;
	private String prodDesc;
	private String prodOs;
	private String prodColour;

	public long getProdId() {
		return prodId;
	}

	public void setProdId(long prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(String prodPrice) {
		this.prodPrice = prodPrice;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public String getProdOs() {
		return prodOs;
	}

	public void setProdOs(String prodOs) {
		this.prodOs = prodOs;
	}

	public String getProdColour() {
		return prodColour;
	}

	public void setProdColour(String prodColour) {
		this.prodColour = prodColour;
	}

}