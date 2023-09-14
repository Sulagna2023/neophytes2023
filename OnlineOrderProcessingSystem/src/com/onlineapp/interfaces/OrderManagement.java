package com.onlineapp.interfaces;

import com.onlineapp.model.Invoice;

/*
 * Order Management Page is common to customer as well as employee.
 */

public interface OrderManagement {

	// A common method that CustomerOrderManagement and EmployeeOrderManagement will have
	public Invoice showInvoice(int invoiceId);

}
