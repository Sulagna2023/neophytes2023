package com.onlineapp.interfaces;

import com.onlineapp.model.Customer;

public interface CustomerOrderManagement extends OrderManagement {
	
	public Customer customerLogin(int customerId, String password);
	public Customer customerLogin(String customerName, String password);
	public void showProducts();
	public void showOrders(int customerId);

}
