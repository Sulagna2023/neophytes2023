package com.onlineapp.model;

public class Customer {
	
	private int customerId;
	private String customerName;
	private long gstNumber;
	private String customerAddress;
	private String customerCity;
	private String cutomerEmail;
	private long customerPhone;
	private int pinCode;
	
	public Customer() {
	}	
	
	public Customer(int customerId, String customerName, long gstNumber, String customerAddress, String customerCity,
			String cutomerEmail, long customerPhone, int pinCode) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.gstNumber = gstNumber;
		this.customerAddress = customerAddress;
		this.customerCity = customerCity;
		this.cutomerEmail = cutomerEmail;
		this.customerPhone = customerPhone;
		this.pinCode = pinCode;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(long gstNumber) {
		this.gstNumber = gstNumber;
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
	public String getCutomerEmail() {
		return cutomerEmail;
	}
	public void setCutomerEmail(String cutomerEmail) {
		this.cutomerEmail = cutomerEmail;
	}
	public long getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", customerName=" + customerName + ", gstNumber=" + gstNumber
				+ ", customerAddress=" + customerAddress + ", customerCity=" + customerCity + ", cutomerEmail="
				+ cutomerEmail + ", customerPhone=" + customerPhone + ", pinCode=" + pinCode + "]";
	}
	
	
	
}