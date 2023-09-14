package com.onlineapp.business;

import java.time.LocalDateTime;

import com.onlineapp.dao.Factory;
import com.onlineapp.exception.CustomerNotFoundException;
import com.onlineapp.exception.EmployeeNotFoundException;
import com.onlineapp.interfaces.CustomerOrderManagement;
import com.onlineapp.interfaces.EmployeeOrderManagement;
import com.onlineapp.model.Customer;
import com.onlineapp.model.Employee;
import com.onlineapp.model.Products;
import com.onlineapp.model.Quote;

/*
 * This class represents the Order Management business layer,acting like a mediator between DAO layer and main.
 */
public class BusinessLayer {

	private EmployeeOrderManagement employeeOrderManagement;
	private CustomerOrderManagement customerOrderManagement;

	public BusinessLayer() {
		this.employeeOrderManagement = Factory.getEmployeeOrderManagementImpl();
		this.customerOrderManagement = Factory.getCustomerOrderManagementImpl();
	}

	public Employee employeeLogin(int employeeId, String password) {
		try {
			Employee e = employeeOrderManagement.employeeLogin(employeeId, password);
			return e;
		} catch (EmployeeNotFoundException ex) {
			System.err.println(ex.getMessage());

		}
		return null;

	}

	public Customer customerLogin(int customerId, String password) {
		try {
			Customer customer = customerOrderManagement.customerLogin(customerId, password);
			return customer;
		} catch (CustomerNotFoundException e) {
			System.err.println(e.getMessage());
		}
		return null;
	}

	public Customer customerLogin(String customerName, String password) {
		try {
			Customer c = customerOrderManagement.customerLogin(customerName, password);
			return c;
		} catch (CustomerNotFoundException ex) {
			System.err.println(ex.getMessage());
		}
		return null;

	}

	public Quote createNewQuote(LocalDateTime date, int customerId) {
		return this.employeeOrderManagement.createNewQuote(date, customerId);
	}

	public Products getProductByProductId(int productId)
	{
		return this.employeeOrderManagement.getProductByProductId(productId);
	}
	
}
