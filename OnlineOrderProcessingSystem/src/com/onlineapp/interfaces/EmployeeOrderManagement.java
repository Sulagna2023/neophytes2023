package com.onlineapp.interfaces;

import com.onlineapp.model.Employee;

public interface EmployeeOrderManagement extends OrderManagement {

	Employee employeeLogin(int employeeId, String password);
	void createNewQuote();
	void importProducts();
	
}
