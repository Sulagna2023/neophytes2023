package com.onlineapp.interfaces;

import java.time.LocalDateTime;
import java.util.Set;

import com.onlineapp.model.Employee;
import com.onlineapp.model.Products;

public interface EmployeeOrderManagement extends OrderManagement {

	public Employee employeeLogin(int employeeId, String password);
	public void createNewQuote(LocalDateTime orderDate, int customerId);
//	void importProducts();
	public void importProducts(Set<Products> productList);
	
}
