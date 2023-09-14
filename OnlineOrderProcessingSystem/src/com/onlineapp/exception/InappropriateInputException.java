package com.onlineapp.exception;

/*
 * This Exception is raised when user enters any data that is inappropriate 
 */

public class InappropriateInputException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InappropriateInputException(String msg, Exception e) {
		super(msg, e);
	}
}
