package com.onlineapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.onlineapp.exception.CustomerNotFoundException;
import com.onlineapp.interfaces.CustomerOrderManagement;
import com.onlineapp.model.Customer;
import com.onlineapp.model.Invoice;

public class CustomerOrderManagementImpl implements CustomerOrderManagement {
	public CustomerOrderManagementImpl() {

	}

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
	public Customer customerLogin(int customerId, String password) throws CustomerNotFoundException {
		Connection con = getConnection();
		if (con != null) {
			try (PreparedStatement ps = con.prepareStatement("select * from customer where customer_id=?,password=?")) {
				ps.setInt(1, customerId);
				ps.setString(2, password);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					Customer customer = new Customer();// need to fetch data from database and pass as parameter
					return customer;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				closeConnection(con);
			}
		}
		throw new CustomerNotFoundException("Incorrect Customer Id or password entered!");
	}

	@Override
	public Customer customerLogin(String customerName, String password) throws CustomerNotFoundException {
		Connection con = getConnection();
		if (con != null) {
			try (PreparedStatement ps = con
					.prepareStatement("select * from customer where customer_name=?,password=?")) {
				ps.setString(1, customerName);
				ps.setString(2, password);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					Customer customer = new Customer();// need to fetch data from database and pass as parameter
					return customer;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				closeConnection(con);
			}
		}
		throw new CustomerNotFoundException("Invalid Customer Name or password entered!");
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
			}
			finally {
				closeConnection(con);
			}
		}
		return null;
	}

	
	@Override
	public void showProducts() {
		Connection con = getConnection();
		if (con != null) {
			try (PreparedStatement ps = con
					.prepareStatement("select * from products")) {
				int count = ps.executeUpdate();
				System.out.println("Displayed: " + count + " no of rows");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				closeConnection(con);
			}
		}
	}

	@Override
	public void showOrders(int customerId) {
		Connection con = getConnection();
		if (con != null) {
			try (PreparedStatement ps = con
					.prepareStatement("select * from orders where customer_id = ? and status = ?")) {
				ps.setInt(1, customerId);
				ps.setString(2, "APPROVED");
				int count = ps.executeUpdate();
				System.out.println("Displayed: " + count + " no of rows");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				closeConnection(con);
			}
		}

	}

//	@Override
//	public void showQuotes() {
//		
//		
//	}

}
