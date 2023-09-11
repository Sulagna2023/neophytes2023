package com.onlineapp.model;

public class Products {

	private int productsId;
	private String productName;
	private double productPrice;
	
	private enum ProductLevel
	{
		
		LEVEL1
		{
			@Override
			public String toString()
			{
				return "Level1";
			}
		}
		,
		LEVEL2
		{
			@Override
			public String toString()
			{
				return "Level2";
			}
		},
		LEVEL3
		{
			@Override
			public String toString()
			{
				return "Level3";
			}
		}
	}
	private ProductLevel productCategory;
	
	
	
	public Products(int productsId, String productName, double productPrice, ProductLevel productCategory) {
		super();
		this.productsId = productsId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
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
	public String getProductCategory()
	{
		return this.productCategory.name();
	}
	 public void setProductCategory(ProductLevel level) {
	        this.productCategory=level;
	    }
	

	@Override
	public String toString() {
		return "Products [productsId=" + productsId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

}