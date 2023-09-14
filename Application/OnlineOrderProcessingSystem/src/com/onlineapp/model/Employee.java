package com.onlineapp.model;

public class Employee {

	private int employeeId;
	private String userName;
	private String passWord;

	public Employee() {
		super();
	}

	/*
	 * Having setters for username, password
	 */
	
	public int getEmployeeId() {
		return employeeId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", userName=" + userName + ", passWord=" + passWord + "]";
	}

}
