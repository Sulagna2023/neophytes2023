package com.onlineapp.interfaces;

public interface EmployeeOrderManagement extends OrderManagement {

	boolean employeeLogin(int employeeId, String password);
	void createNewQuote();
	void importProducts();
	
}
