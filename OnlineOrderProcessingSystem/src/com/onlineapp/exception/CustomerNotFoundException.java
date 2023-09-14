package com.onlineapp.exception;

/*
 * This Exception is raised when customer enters wrong credentials while logging in 
 */

public class CustomerNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public CustomerNotFoundException(String msg) {
		super(msg);
	}
}
