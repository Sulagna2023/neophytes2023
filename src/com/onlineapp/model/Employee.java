package com.onlineapp.model;

import java.util.Objects;

public class Employee {

	private int employee_id;
	private String user_name;
	private String password;

	public Employee(int employee_id, String user_name, String password) {
		super();
		this.employee_id = employee_id;
		this.user_name = user_name;
		this.password = password;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employee_id, password, user_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employee_id == other.employee_id;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", user_name=" + user_name + ", password=" + password + "]";
	}

}
