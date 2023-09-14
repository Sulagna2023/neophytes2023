package com.onlineapp.exception;

/*
 *This exception is raised when Employee enters wrong credentials while logging in. 
 */

public class EmployeeNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException(String msg) {
		super(msg);
	}
}
