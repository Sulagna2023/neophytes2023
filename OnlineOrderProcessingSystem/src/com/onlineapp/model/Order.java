package com.onlineapp.model;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

	private int orderId;
	private LocalDateTime orderDate;
	private Customer customerDetails;
	private List<Products> productList;
	private double totalOrderValue;
//	private double shippingCost;    //we are calculating no need here
	private String shippingAgency;
	private Invoice invoice;

	private enum OrderStatus {
		PENDING, APPROVED, COMPLETED, EXPIRED
	}

	private OrderStatus status;

	public Order() {
		super();
	}

	public Order(int orderId, LocalDateTime orderDate, Customer customerDetails, List<Products> productList,
			double totalOrderValue, String shippingAgency, Invoice invoice, OrderStatus status) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.customerDetails = customerDetails;
		this.productList = productList;
		this.totalOrderValue = totalOrderValue;
//		this.shippingCost = shippingCost;
		this.shippingAgency = shippingAgency;
		this.invoice = invoice;
		this.status = status;
	}

	public int getOrderId() {
		return orderId;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
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

//	public double getShippingCost() {
//		return shippingCost;
//	}
//
	public String getShippingAgency() {
		return shippingAgency;
	}

	public String getStatus() {
		return this.status.name();
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Customer getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(Customer customerDetails) {
		this.customerDetails = customerDetails;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", customer=" + customerDetails
				+ ", productList=" + productList + ", totalOrderValue=" + totalOrderValue + ", shippingAgency="
				+ shippingAgency + "]";
	}

}