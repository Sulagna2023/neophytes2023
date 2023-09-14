package com.onlineapp.model;

public class Customer {

	private int customerId;
	private String customerName;
	private long gstNumber;
	private String customerAddress;
	private String customerCity;
	private String customerEmail;
	private long customerPhone;
	private int pinCode;

	public Customer() {
	}

	public Customer(int customerId, String customerName, long gstNumber, String customerAddress, String customerCity,
			String customerEmail, long customerPhone, int pinCode) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.gstNumber = gstNumber;
		this.customerAddress = customerAddress;
		this.customerCity = customerCity;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
		this.pinCode = pinCode;
	}

	/*
	 * Having setters for 
	 * customer name, customer email, customer phone, customer address, customer city, customer pin code
	 * as these fields can be changed
	 */
	
	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String cutomerEmail) {
		this.customerEmail = cutomerEmail;
	}

	public long getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	public long getGstNumber() {
		return gstNumber;
	}

	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", customerName=" + customerName + ", gstNumber=" + gstNumber
				+ ", customerAddress=" + customerAddress + ", customerCity=" + customerCity + ", customerEmail="
				+ customerEmail + ", customerPhone=" + customerPhone + ", pinCode=" + pinCode + "]";
	}

}