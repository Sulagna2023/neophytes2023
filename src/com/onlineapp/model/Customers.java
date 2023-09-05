package com.onlineapp.model;

import java.util.Objects;

public class Customers {
	
	private int customer_id;
	private String customer_name;
	private long gst_number;
	private String customer_address;
	private String customer_city;
	private String cutomer_email;
	private long customer_phone;
	
	public Customers(int customer_id, String customer_name, long gst_number, String customer_address,
			String customer_city, String cutomer_email, long customer_phone) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.gst_number = gst_number;
		this.customer_address = customer_address;
		this.customer_city = customer_city;
		this.cutomer_email = cutomer_email;
		this.customer_phone = customer_phone;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public long getGst_number() {
		return gst_number;
	}

	public void setGst_number(long gst_number) {
		this.gst_number = gst_number;
	}

	public String getCustomer_address() {
		return customer_address;
	}

	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

	public String getCustomer_city() {
		return customer_city;
	}

	public void setCustomer_city(String customer_city) {
		this.customer_city = customer_city;
	}

	public String getCutomer_email() {
		return cutomer_email;
	}

	public void setCutomer_email(String cutomer_email) {
		this.cutomer_email = cutomer_email;
	}

	public long getCustomer_phone() {
		return customer_phone;
	}

	public void setCustomer_phone(long customer_phone) {
		this.customer_phone = customer_phone;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customers other = (Customers) obj;
		return customer_id == other.customer_id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(customer_address, customer_city, customer_id, customer_name, customer_phone, cutomer_email,
				gst_number);
	}
	
	@Override
	public String toString() {
		return "Customers [customer_id=" + customer_id + ", customer_name=" + customer_name + ", gst_number="
				+ gst_number + ", customer_address=" + customer_address + ", customer_city=" + customer_city
				+ ", cutomer_email=" + cutomer_email + ", customer_phone=" + customer_phone + "]";
	}	
	
}
