package com.onlineapp.dao;

import com.onlineapp.interfaces.CustomerOrderManagement;
import com.onlineapp.interfaces.EmployeeOrderManagement;

//Factory class returning implementation for respective user
public class Factory {
	
	public static EmployeeOrderManagement getEmployeeOrderManagementImpl() {
		return new EmployeeOrderManagementImpl();
	}
	
	public static CustomerOrderManagement getCustomerOrderManagementImpl() {
		return new CustomerOrderManagementImpl();
	}

}
