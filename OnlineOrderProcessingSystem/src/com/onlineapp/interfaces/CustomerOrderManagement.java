package com.onlineapp.interfaces;

import com.onlineapp.model.Customer;

public interface CustomerOrderManagement extends OrderManagement {
	
	Customer customerLogin(int customerId, String password);
	Customer customerLogin(String customerName, String password);
	void showQuotes();
	void showOrders();

}
