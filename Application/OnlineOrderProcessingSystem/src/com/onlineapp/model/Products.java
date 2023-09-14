package com.onlineapp.model;

public class Products {

	private int productId;
	private String productName;
	private double productPrice;

	private enum ProductLevel {

		LEVEL1 {
			@Override
			public String toString() {
				return "Level1";
			}
		},
		LEVEL2 {
			@Override
			public String toString() {
				return "Level2";
			}
		},
		LEVEL3 {
			@Override
			public String toString() {
				return "Level3";
			}
		}
	}

	private ProductLevel productCategory;	

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(int productsId, String productName, double productPrice, ProductLevel productCategory) {
		super();
		this.productId = productsId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
	}
	
	/*
	 * No setters for product id, product price, product category as these fields can't be changed
	 */
	

	public int getProductsId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public String getProductCategory() {
		return this.productCategory.name();
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

}