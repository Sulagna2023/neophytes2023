package com.onlineapp.business;

import com.onlineapp.dao.Factory;
import com.onlineapp.interfaces.CustomerOrderManagement;
import com.onlineapp.interfaces.EmployeeOrderManagement;

public class BusinessLayer {
	
	private EmployeeOrderManagement employeeOrderManagement;
	private CustomerOrderManagement customerOrderManagement;
	
	public BusinessLayer() {
		this.employeeOrderManagement = Factory.getEmployeeOrderManagementImpl();
		this.customerOrderManagement = Factory.getCustomerOrderManagementImpl();
	}
	
	public boolean employeeLogin(int employeeId, String password) {
		boolean isLogged = this.employeeOrderManagement.employeeLogin(employeeId, password);
		return isLogged;
	}
	
	public boolean customerLogin(int customerId, String password) {
		boolean isLogged = this.customerOrderManagement.customerLogin(customerId, password);
		return isLogged;
	}
	
	public boolean customerLogin(String customerName, String password) {
		boolean isLogged = this.customerOrderManagement.customerLogin(customerName, password);
		return isLogged;
	}
	

}
