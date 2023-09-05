package com.onlineapp.model;

import java.util.Objects;

public class Products {

	private int products_id;
	private String product_name;
	private double product_price;

//	private enum product_category{
//		LEVEL1("level1"),
//		LEVEL2("level2"),
//		LEVEL3("level3")
//	};
	public Products(int products_id, String product_name, double product_price) {
		super();
		this.products_id = products_id;
		this.product_name = product_name;
		this.product_price = product_price;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	public int getProducts_id() {
		return products_id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(product_name, product_price, products_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return products_id == other.products_id;
	}

	@Override
	public String toString() {
		return "Products [products_id=" + products_id + ", product_name=" + product_name + ", product_price="
				+ product_price + "]";
	}

}
