package com.onlineapp.interfaces;

import com.onlineapp.exception.CustomerNotFoundException;
import com.onlineapp.model.Customer;

/*
 * This interface contains all the functionalities that a customer will have.
 * These functions will be displayed in Customer Order Management page.
 */

public interface CustomerOrderManagement extends OrderManagement {

	public Customer customerLogin(int customerId, String password) throws CustomerNotFoundException;

	public Customer customerLogin(String customerName, String password) throws CustomerNotFoundException;

	public void showProducts();

	public void showOrders(int customerId);

}
