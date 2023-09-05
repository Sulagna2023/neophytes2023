package com.onlineapp.model;

import java.time.LocalDate;
import java.util.Objects;

public class Orders {

	private int order_id;
	private LocalDate order_date;
	private int customer_id;
	// product list
	private double total_order_value;
	private double shipping_cost;
	private String shipping_agency;
	// status enum

	public Orders(int order_id, LocalDate order_date, int customer_id, double total_order_value, double shipping_cost,
			String shipping_agency) {
		super();
		this.order_id = order_id;
		this.order_date = order_date;
		this.customer_id = customer_id;
		this.total_order_value = total_order_value;
		this.shipping_cost = shipping_cost;
		this.shipping_agency = shipping_agency;
	}

	public LocalDate getOrder_date() {
		return order_date;
	}

	public void setOrder_date(LocalDate order_date) {
		this.order_date = order_date;
	}

	public double getTotal_order_value() {
		return total_order_value;
	}

	public void setTotal_order_value(double total_order_value) {
		this.total_order_value = total_order_value;
	}

	public double getShipping_cost() {
		return shipping_cost;
	}

	public void setShipping_cost(double shipping_cost) {
		this.shipping_cost = shipping_cost;
	}

	public String getShipping_agency() {
		return shipping_agency;
	}

	public void setShipping_agency(String shipping_agency) {
		this.shipping_agency = shipping_agency;
	}

	public int getOrder_id() {
		return order_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customer_id, order_date, order_id, shipping_agency, shipping_cost, total_order_value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orders other = (Orders) obj;
		return order_id == other.order_id;
	}

	@Override
	public String toString() {
		return "Orders [order_id=" + order_id + ", order_date=" + order_date + ", customer_id=" + customer_id
				+ ", total_order_value=" + total_order_value + ", shipping_cost=" + shipping_cost + ", shipping_agency="
				+ shipping_agency + "]";
	}

}
