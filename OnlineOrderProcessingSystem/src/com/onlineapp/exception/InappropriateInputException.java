package com.onlineapp.exception;

public class InappropriateInputException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InappropriateInputException(String msg, Exception e)
	{
		super(msg,e);
	}
}
