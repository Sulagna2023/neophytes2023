package com.onlineapp.model;

import java.time.LocalDateTime;
import java.util.List;

public class Invoice {

	private int invoiceId;
	private LocalDateTime invoiceDate;
	private Order orderDetails;
	private Customer customerDetails;
	private List<Products> productList;
	private double gstAmount;
	private double totalInvoiceValue;

	private enum Gst {
		INTER_STATE, SAME_STATE
	}

	private Gst gstType;

	private enum PaymentStatus {
		PAID, UNPAID
	}

	private PaymentStatus status;

	public Invoice() {
		super();
	}

	public Invoice(int invoiceId, LocalDateTime invoiceDate, Order orderDetails, Customer customerDetails,
			List<Products> productList, Gst gstType, double gstAmount, double totalInvoiceValue, PaymentStatus status) {
		super();
		this.invoiceId = invoiceId;
		this.invoiceDate = invoiceDate;
		this.orderDetails = orderDetails;
		this.customerDetails = customerDetails;
		this.productList = productList;
		this.gstType = gstType;
		this.gstAmount = gstAmount;
		this.totalInvoiceValue = totalInvoiceValue;
		this.status = status;
	}

	/*
	 * Setters for customer details, product list and status as these fields can be changed
	 */
	
	public int getInvoiceId() {
		return invoiceId;
	}

	public LocalDateTime getInvoiceDate() {
		return invoiceDate;
	}

	public Order getOrderDetails() {
		return orderDetails;
	}

	public Customer getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(Customer customerDetails) {
		this.customerDetails = customerDetails;
	}

	public List<Products> getProductList() {
		return productList;
	}

	public void setProductList(List<Products> productList) {
		this.productList = productList;
	}

	public String getGstType() {
		return this.gstType.name();
	}

	public double getGstAmount() {
		return gstAmount;
	}

	public double getTotalInvoiceValue() {
		return totalInvoiceValue;
	}

	public String getStatus() {
		return this.status.name();
	}

	public void setStatus(PaymentStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", invoiceDate=" + invoiceDate + ", orderDetails=" + orderDetails
				+ ", customerDetails=" + customerDetails + ", productList=" + productList + ", gstAmount=" + gstAmount
				+ ", totalInvoiceValue=" + totalInvoiceValue + "]";
	}

}