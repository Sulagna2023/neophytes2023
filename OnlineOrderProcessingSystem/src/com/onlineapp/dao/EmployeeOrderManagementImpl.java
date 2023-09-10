package com.onlineapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import com.onlineapp.interfaces.EmployeeOrderManagement;
import com.onlineapp.model.Employee;
import com.onlineapp.model.Invoice;
import com.onlineapp.model.Quote;

public class EmployeeOrderManagementImpl implements EmployeeOrderManagement {
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("", "root", "");
			if (con != null)
				System.out.println("Connection established successfully");
			else
				System.out.println("Connection not established successfully");
			return con;
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return null;
	}

	public void closeConnection(Connection con) {
		if (con != null)
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		else
			System.out.println("Connection got never established");
	}

	@Override
	public Invoice showInvoice(int invoiceId) {
		Connection con = getConnection();
		if (con != null) {
			try (PreparedStatement ps = con.prepareStatement("select * from invoice where invoiceId=?")) {
				ps.setInt(1, invoiceId);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					Invoice invoice = new Invoice();
					return invoice;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				closeConnection(con);
			}
		}
		return null;
	}

	@Override
	public Employee employeeLogin(int employeeId, String password) {
		Connection con = getConnection();
		if (con != null) {
			try (PreparedStatement ps = con.prepareStatement("select * from customer where employee_id=?,password=?")) {
				ps.setInt(1, employeeId);
				ps.setString(2, password);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					Employee employee = new Employee();// need to fetch data from database and pass as parameter
					return employee;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				closeConnection(con);
			}
		}
		return null;
	}

	@Override
	public void createNewQuote(LocalDateTime orderDate, int customerId) {
		
		Connection con=getConnection();
		if(con!=null)
		{
			try(PreparedStatement ps=con.prepareStatement("select * from customer where customer_id=?"))
			{
				ps.setInt(1, customerId);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					Quote quote = new Quote();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			} finally {
				closeConnection(con);
			}
		}
	}

	@Override
	public void createNewQuote(LocalDateTime orderDate, String customerName) {

		Connection con = getConnection();
		if (con != null) {
			try (PreparedStatement ps = con.prepareStatement("select * from customer where customer_name=?")) {
				ps.setString(2, customerName);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					Quote quote = new Quote();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				closeConnection(con);
			}
		}
	}

	@Override
	public void importProducts() {

	}

}
