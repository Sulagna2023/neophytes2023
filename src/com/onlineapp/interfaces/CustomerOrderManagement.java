package com.onlineapp.interfaces;

public interface CustomerOrderManagement extends OrderManagement {
	
	boolean customerLogin(int customerId, String password);
	boolean customerLogin(String customerName, String password);
	void showQuotes();
	void showOrders();

}
