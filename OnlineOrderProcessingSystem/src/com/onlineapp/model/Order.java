package com.onlineapp.model;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

	private int orderId;
	private LocalDateTime orderDate;
//	private Customer customerDetails;
	private int customerId;
	private List<Products> pendingProductList;
	private List<Products> approvedProductList;
	private double totalOrderValue;
//	private double shippingCost;
	private String shippingAgency;
	private Invoice invoice;

	private enum Status {
		PENDING, APPROVED, COMPLETED, EXPIRED
	}

	public Order() {
		super();
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

//	public Customer getCustomer() {
//		return customerDetails;
//	}
//
//
//	public void setCustomer(Customer customer) {
//		this.customerDetails = customer;
//	}

	public double getTotalOrderValue() {
		return totalOrderValue;
	}

	public void setTotalOrderValue(double totalOrderValue) {
		this.totalOrderValue = totalOrderValue;
	}

	public List<Products> getPendingProductList() {
		return pendingProductList;
	}

	public void setPendingProductList(List<Products> pendingProductList) {
		this.pendingProductList = pendingProductList;
	}

	public List<Products> getApprovedProductList() {
		return approvedProductList;
	}

	public void setApprovedProductList(List<Products> approvedProductList) {
		this.approvedProductList = approvedProductList;
	}

//	public double getShippingCost() {
//		return shippingCost;
//	}
//
//
//	public void setShippingCost(double shippingCost) {
//		this.shippingCost = shippingCost;
//	}

	public String getShippingAgency() {
		return shippingAgency;
	}

	public void setShippingAgency(String shippingAgency) {
		this.shippingAgency = shippingAgency;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", customerId=" + customerId
				+ ", pendingProductList=" + pendingProductList + ", approvedProductList=" + approvedProductList
				+ ", totalOrderValue=" + totalOrderValue + ", shippingAgency=" + shippingAgency + ", invoice=" + invoice
				+ "]";
	}

}