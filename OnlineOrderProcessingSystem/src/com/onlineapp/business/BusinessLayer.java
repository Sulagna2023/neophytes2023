package com.onlineapp.business;

import com.onlineapp.interfaces.CustomerOrderManagement;
import com.onlineapp.interfaces.EmployeeOrderManagement;
import com.onlineapp.model.Customer;
import com.onlineapp.model.Employee;
import com.onlineapp.*;
import com.onlineapp.dao.Factory;
public class BusinessLayer {
	
	private EmployeeOrderManagement employeeOrderManagement;
	private CustomerOrderManagement customerOrderManagement;
	
	public BusinessLayer() {
		this.employeeOrderManagement = Factory.getEmployeeOrderManagementImpl();
		this.customerOrderManagement = Factory.getCustomerOrderManagementImpl();
	}
	
	public Employee employeeLogin(int employeeId, String password) {
		return this.employeeOrderManagement.employeeLogin(employeeId, password);
	}
	
	public Customer customerLogin(int customerId, String password) {
		return this.customerOrderManagement.customerLogin(customerId, password);
	}
	
	public Customer customerLogin(String customerName, String password) {
		return this.customerOrderManagement.customerLogin(customerName, password);
	}
	
	

}
