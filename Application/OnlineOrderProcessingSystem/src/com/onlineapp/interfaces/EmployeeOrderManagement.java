package com.onlineapp.interfaces;

import java.time.LocalDateTime;
import java.util.Set;

import com.onlineapp.exception.EmployeeNotFoundException;
import com.onlineapp.model.Employee;
import com.onlineapp.model.Products;
import com.onlineapp.model.Quote;

/*
 * This interface contains all the functionalities that an employee will have.
 * These functions will be displayed in Employee Order Management page.
 */

public interface EmployeeOrderManagement extends OrderManagement {

	public Employee employeeLogin(int employeeId, String password) throws EmployeeNotFoundException;

	public Quote createNewQuote(LocalDateTime orderDate, int customerId);

//	void importProducts();
	public void importProducts(Set<Products> productList);

	public Products getProductByProductId(int productId);

}
