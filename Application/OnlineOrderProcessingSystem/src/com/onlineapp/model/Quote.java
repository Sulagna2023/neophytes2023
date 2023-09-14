package com.onlineapp.model;

import java.time.LocalDateTime;
import java.util.Set;

public class Quote {

	private LocalDateTime orderDate;
	private Customer customer;
	private double shippingCost;
	private Set<Products> productList;
	private double totalOrderValue;

	private enum OrderStatus {
		PENDING, APPROVED, COMPLETED, EXPIRED
	}

	private OrderStatus status;

	public Quote() {
		super();
	}

	public Quote(LocalDateTime orderDate, Customer customer, double shippingCost, Set<Products> productList,
			double totalOrderValue,  String status) {
		super();
		this.orderDate = orderDate;
		this.customer = customer;
		this.shippingCost = shippingCost;
		this.productList = productList;
		this.totalOrderValue = totalOrderValue;
		this.status=OrderStatus.valueOf(status);
	}
	
	/*
	 * Having setters for order date, shipping cost, product list, status
	 */

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

	public Set<Products> getProductList() {
		return productList;
	}

	public void setProductList(Set<Products> productList) {
		this.productList = productList;
	}

	public double getTotalOrderValue() {
		return totalOrderValue;
	}

	public String getStatus() {
		return this.status.name();
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Quote [orderDate=" + orderDate + ", customer=" + customer + ", shippingCost=" + shippingCost
				+ ", productList=" + productList + ", totalOrderValue=" + totalOrderValue + ", status=" + status + "]";
	}

}