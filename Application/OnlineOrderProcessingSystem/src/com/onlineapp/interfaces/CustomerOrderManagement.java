package com.onlineapp.interfaces;

import java.util.List;

import com.onlineapp.exception.CustomerNotFoundException;
import com.onlineapp.model.Customer;
import com.onlineapp.model.Order;

/*
 * This interface contains all the functionalities that a customer will have.
 * These functions will be displayed in Customer Order Management page.
 */

public interface CustomerOrderManagement extends OrderManagement {

	public Customer customerLogin(int customerId, String password) throws CustomerNotFoundException;

	public Customer customerLogin(String customerName, String password) throws CustomerNotFoundException;

	public void showProducts();

	public List<Order> showOrders(int customerId);

}
