package com.onlineapp.model;

import java.time.LocalDateTime;
import java.util.List;

public class Quote {
	
	LocalDateTime orderDate;
	Customer customer;
	double shippingCost;
	List<Products> productList;
	double totalOrderValue;
	
	public Quote(){
	}

	
	
	public Quote(LocalDateTime orderDate, Customer customer, double shippingCost, List<Products> productList,
			double totalOrderValue) {
		super();
		this.orderDate = orderDate;
		this.customer = customer;
		this.shippingCost = shippingCost;
		this.productList = productList;
		this.totalOrderValue = totalOrderValue;
	}



	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public double getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}

	public List<Products> getProductList() {
		return productList;
	}

	public void setProductList(List<Products> productList) {
		this.productList = productList;
	}

	public double getTotalOrderValue() {
		return totalOrderValue;
	}

	public void setTotalOrderValue(double totalOrderValue) {
		this.totalOrderValue = totalOrderValue;
	}

	@Override
	public String toString() {
		return "Quote [orderDate=" + orderDate + ", customer=" + customer + ", productList=" + productList + "]";
	}
	
	
	

}
