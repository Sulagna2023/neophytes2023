package com.onlineapp.model;

import java.util.Objects;

public class Company {

	private String company_name;
	private String company_address;
	private String company_city;
	private int gst_number;

	public Company(String company_name, String company_address, String company_city, int gst_number) {
		super();
		this.company_name = company_name;
		this.company_address = company_address;
		this.company_city = company_city;
		this.gst_number = gst_number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(company_address, company_city, company_name, gst_number);
	}

	@Override
	public boolean equals(Object obj) { // check
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		return Objects.equals(company_address, other.company_address)
				&& Objects.equals(company_city, other.company_city) && Objects.equals(company_name, other.company_name)
				&& gst_number == other.gst_number;
	}

	@Override
	public String toString() {
		return "Company [company_name=" + company_name + ", company_address=" + company_address + ", company_city="
				+ company_city + ", gst_number=" + gst_number + "]";
	}

}
