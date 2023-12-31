package com.onlineapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.onlineapp.exception.EmployeeNotFoundException;
import com.onlineapp.interfaces.EmployeeOrderManagement;
import com.onlineapp.model.Customer;
import com.onlineapp.model.Employee;
import com.onlineapp.model.Invoice;
import com.onlineapp.model.Products;
import com.onlineapp.model.Quote;

/*
 * DAO class for implementing all the methods for employee order management page
 */

public class EmployeeOrderManagementImpl implements EmployeeOrderManagement {

	// getting mysql (jdbc) connection
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/order_management_system?useSSL=false", "root", "Anirudh@18");
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

	// closing connection
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
	public Employee employeeLogin(int employeeId, String password) throws EmployeeNotFoundException {
		Connection con = getConnection();
		if (con != null) {
			try (PreparedStatement ps = con.prepareStatement("select * from employee where employee_id=?,password=?")) {
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
		throw new EmployeeNotFoundException("Incorrect Employee Id or Password entered!");
	}

	@Override
	public Quote createNewQuote(LocalDateTime orderDate, int customerId) {

		Connection con = getConnection();
		if (con != null) {
			try (PreparedStatement ps = con.prepareStatement("select * from customer where customer_id=?")) {
				ps.setInt(1, customerId);
				ResultSet rs = ps.executeQuery();

				String customer_name = rs.getString(2);
				long gstNumber = rs.getInt(3);
				String customerAddress = rs.getString(4);
				String customerCity = rs.getString(5);
				String customerEmail = rs.getString(6);
				long customerPhone = rs.getLong(7);
				int pincode = rs.getInt(8);

				Customer customer = new Customer(customerId, customer_name, gstNumber, customerAddress, customerCity,
						customerEmail, customerPhone, pincode);

				PreparedStatement ps1 = con
						.prepareStatement("select total_order_value, count(product_list) from Orders where status = ?");
				ps.setString(1, "PENDING");

				ResultSet rs1 = ps1.executeQuery();
				double totalOrderValue = rs1.getDouble(6);

				Set<Products> productList = new HashSet<Products>();

				// fetch productList from database into result set

				int countProducts = productList.size();

				EmployeeOrderManagementImpl obj = new EmployeeOrderManagementImpl();

				double shippingCost = obj.calculateShippingCost(totalOrderValue, productList);

				Quote quote = new Quote();
				while (rs.next()) {
					quote = new Quote(orderDate, customer, shippingCost, productList, totalOrderValue, "PENDING");
				}

				return quote;
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				closeConnection(con);
			}
		}
		return null;
	}

	@Override
	public void importProducts(Set<Products> productList) {
		Connection con = getConnection();
		if (con != null) {
			for (Products p : productList) {
				try (PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?,?)")) {
					ps.setInt(1, p.getProductsId());
					ps.setString(2, p.getProductName());
					ps.setDouble(3, p.getProductPrice());
					ps.setString(4, p.getProductCategory());
					ps.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			closeConnection(con);
		}
	}

	public Products getProductByProductId(int productId) {
		Connection con = getConnection();
		if (con != null) {
			try (PreparedStatement ps = con.prepareStatement("select * from products where product_id=?")) {
				ps.setInt(1, productId);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					Products p = new Products();
					return p;
				}
			} catch (SQLException e) {
				System.out.println(e);
			} finally {
				closeConnection(con);
			}
		} else {
			System.out.println("Connection object is null");
		}
		return null;
	}

	public double calculateShippingCost(double totalOrderValue, Set<Products> productList) {
		double shippingCost = 0;
		if (totalOrderValue > 100000)
			return 0;
		else if (totalOrderValue <= 100000) {
			Iterator<Products> itr = productList.iterator();
			while (itr.hasNext()) {
				if (itr.next().getProductCategory() == "Level1")
					shippingCost += 0.5 * totalOrderValue;
				if (itr.next().getProductCategory() == "Level2")
					shippingCost += 0.3 * totalOrderValue;
				if (itr.next().getProductCategory() == "Level3")
					shippingCost += 0.2 * totalOrderValue;
			}
		}
		return shippingCost;
	}

}
