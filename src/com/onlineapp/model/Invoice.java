package com.onlineapp.model;

import java.time.LocalDateTime;
import java.util.List;

public class Invoice {
	
	private int invoiceId;
	private LocalDateTime invoiceDate;
	private Order orderDetails;
	private Customer customerDetails;
	private List<Products> productList;
	private enum gstType{
		INTER_STATE,
		SAME_STATE
	}
	private double gstAmount;
	private double totalInvoiceValue;
	private enum Status{
		PAID,
		UNPAID
	}
	
	public Invoice(){
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public LocalDateTime getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(LocalDateTime invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Order getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Order orderDetails) {
		this.orderDetails = orderDetails;
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

	public double getGstAmount() {
		return gstAmount;
	}

	public void setGstAmount(double gstAmount) {
		this.gstAmount = gstAmount;
	}

	public double getTotalInvoiceValue() {
		return totalInvoiceValue;
	}

	public void setTotalInvoiceValue(double totalInvoiceValue) {
		this.totalInvoiceValue = totalInvoiceValue;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", invoiceDate=" + invoiceDate + ", orderDetails=" + orderDetails
				+ ", customerDetails=" + customerDetails + ", productList=" + productList + ", gstAmount=" + gstAmount
				+ ", totalInvoiceValue=" + totalInvoiceValue + "]";
	}
	
	
	

}
