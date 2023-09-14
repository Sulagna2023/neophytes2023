package com.onlineapp.model;

import java.time.LocalDateTime;
import java.util.List;

public class Quote {

	LocalDateTime orderDate;
	int customerId;
	double shippingCost;
	List<Products> productList;
	double totalOrderValue;

	private enum OrderStatus {
		PENDING, APPROVED, COMPLETED, EXPIRED
	}

	private OrderStatus status;

	public Quote() {
		super();
	}

	public Quote(LocalDateTime orderDate, int customerId, double shippingCost, List<Products> productList,
			double totalOrderValue, OrderStatus status) {
		super();
		this.orderDate = orderDate;
		this.customerId = customerId;
		this.shippingCost = shippingCost;
		this.productList = productList;
		this.totalOrderValue = totalOrderValue;
		this.status = status;
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

	public String getStatus() {
		return this.status.name();
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Quote [orderDate=" + orderDate + ", customerId=" + customerId + ", shippingCost=" + shippingCost
				+ ", productList=" + productList + ", totalOrderValue=" + totalOrderValue + ", status=" + status + "]";
	}

}