package com.onlineapp.model;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

	private int orderId;
	private LocalDateTime orderDate;
	private Customer customerDetails;
	private List<Products> productList;
	private double totalOrderValue;
	private double shippingCost;
	private String shippingAgency;
	private Invoice invoice;
	private enum Status{
		PENDING,
		APPROVED,
		COMPLETED,
		EXPIRED
	}
	
	
	public Order(){
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public LocalDateTime getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}


	public Customer getCustomer() {
		return customerDetails;
	}


	public void setCustomer(Customer customer) {
		this.customerDetails = customer;
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


	public double getShippingCost() {
		return shippingCost;
	}


	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}


	public String getShippingAgency() {
		return shippingAgency;
	}


	public void setShippingAgency(String shippingAgency) {
		this.shippingAgency = shippingAgency;
	}


	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", customer=" + customerDetails + ", productList="
				+ productList + ", totalOrderValue=" + totalOrderValue + ", shippingCost=" + shippingCost
				+ ", shippingAgency=" + shippingAgency + "]";
	}
	
	
	
	
	

}