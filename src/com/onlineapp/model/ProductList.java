package com.onlineapp.model;

import java.util.Objects;

public class ProductList {

	private int order_id;
	//json list product_list

	public ProductList(int order_id) {
		super();
		this.order_id = order_id;
	}
	
	public int getOrder_id() {
		return order_id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(order_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductList other = (ProductList) obj;
		return order_id == other.order_id;
	}

	@Override
	public String toString() {
		return "ProductList [order_id=" + order_id + "]";
	}
	
	
	
}
