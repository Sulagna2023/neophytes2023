package com.onlineapp.model;

public class Company {
	
	private String companyName;
	private String companyAddress;
	private String companyCity;
	private int gstNumber;
	
	public Company(){
	}
	
	public Company(String companyName, String companyAddress, String companyCity, int gstNumber) {
		super();
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyCity = companyCity;
		this.gstNumber = gstNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyCity() {
		return companyCity;
	}

	public void setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
	}

	public int getGstNumber() {
		return gstNumber;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyAddress=" + companyAddress + ", companyCity="
				+ companyCity + ", gstNumber=" + gstNumber + "]";
	}
	
}
