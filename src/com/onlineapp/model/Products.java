package com.onlineapp.model;

import java.util.Objects;

public class Products {

	private int productsId;
	private String productName;
	private double productPrice;
	
	private enum productCategory{
		LEVEL1,
		LEVEL2,
		LEVEL3
	}
	
	//	private enum product_category{
	//	LEVEL1("level1"),
	//	LEVEL2("level2"),
	//	LEVEL3("level3")
	//};	
	
	
	
	public Products() {
	}
	
	public Products(int productsId, String productName, double productPrice) {
		super();
		this.productsId = productsId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductsId() {
		return productsId;
	}

	public void setProductsId(int productsId) {
		this.productsId = productsId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	

	@Override
	public String toString() {
		return "Products [productsId=" + productsId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

}