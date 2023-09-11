package com.onlineapp.interfaces;

import java.util.Set;

import com.onlineapp.model.Employee;
import com.onlineapp.model.Products;

public interface EmployeeOrderManagement extends OrderManagement {

	Employee employeeLogin(int employeeId, String password);
	void createNewQuote();
	void importProducts();
	void importProducts(Set<Products> productList);
	
}
