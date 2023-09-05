package com.onlineapp.model;

import java.time.LocalDate;
import java.util.Objects;

public class Invoice {

	private int invoice_id;
	private LocalDate datetime;
	private int order_id;
	private int customer_id;
	private int product_list; // int or json?
	// enum gst_type
	private double total_gst_amt;
	private double total_invoice_value;
	// enum status;

	public Invoice(int invoice_id, LocalDate datetime, int order_id, int customer_id, int product_list,
			double total_gst_amt, double total_invoice_value) {
		super();
		this.invoice_id = invoice_id;
		this.datetime = datetime;
		this.order_id = order_id;
		this.customer_id = customer_id;
		this.product_list = product_list;
		this.total_gst_amt = total_gst_amt;
		this.total_invoice_value = total_invoice_value;
	}

	public LocalDate getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDate datetime) {
		this.datetime = datetime;
	}

	public int getProduct_list() {
		return product_list;
	}

	public void setProduct_list(int product_list) {
		this.product_list = product_list;
	}

	public double getTotal_gst_amt() {
		return total_gst_amt;
	}

	public void setTotal_gst_amt(double total_gst_amt) {
		this.total_gst_amt = total_gst_amt;
	}

	public double getTotal_invoice_value() {
		return total_invoice_value;
	}

	public void setTotal_invoice_value(double total_invoice_value) {
		this.total_invoice_value = total_invoice_value;
	}

	public int getInvoice_id() {
		return invoice_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customer_id, datetime, invoice_id, order_id, product_list, total_gst_amt,
				total_invoice_value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Invoice other = (Invoice) obj;
		return invoice_id == other.invoice_id;
	}

	@Override
	public String toString() {
		return "Invoice [invoice_id=" + invoice_id + ", datetime=" + datetime + ", order_id=" + order_id
				+ ", customer_id=" + customer_id + ", product_list=" + product_list + ", total_gst_amt=" + total_gst_amt
				+ ", total_invoice_value=" + total_invoice_value + "]";
	}

}
