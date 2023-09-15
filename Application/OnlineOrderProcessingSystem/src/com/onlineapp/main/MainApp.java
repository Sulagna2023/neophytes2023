package com.onlineapp.main;

import java.io.Console;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.onlineapp.business.BusinessLayer;
import com.onlineapp.model.Customer;
import com.onlineapp.model.Employee;
import com.onlineapp.model.Products;

public class MainApp {

	private static final int case1 = 0;

	public static void main(String[] args) {

		BusinessLayer b = new BusinessLayer();
		Scanner scan = new Scanner(System.in);
		Console console = System.console();

		int choice;

		System.out.println(String.format("%80s", "Online Order Processing System"));
		System.out.println(String.format("%85s", "______________________________________\n\n"));

		System.out.println(String.format("%80s", "Welcome to the Application!!\n\n"));
		System.out.println(
				"_____________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("\nChoose your category:\n\n");
		main: {
			do {
				System.out.println("1.Employee Login \n2.Customer Login\n3.Exit");
				choice = scan.nextInt();
				outer: {

					switch (choice) {
					case 1:
						int empId, invoiceId, ch;
						String pass;
						System.out.println("EMPLOYEE LOGIN");
						System.out.print("Enter employee ID :\n");
						empId = scan.nextInt();
						System.out.println("Enter password :");
						pass = scan.next();

						Employee emp = b.employeeLogin(empId, pass);
						if (emp != null) {
							System.out.println("You are successfully logged in.\n");
							do {

								System.out.println(
										"Enter your choice: \n1.Create New Quote  \n2.Import Products \n3.Main Menu");

								ch = scan.nextInt();
								inner: {
									switch (ch) {
									case 1:
										System.out.println("CREATE NEW QUOTE");
										System.out.println("Enter date in MM/dd/yyyy format:");
										String str = scan.next();
										System.out.println("Enter customer Id:");
										int id = scan.nextInt();
										DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
										LocalDate localDate = LocalDate.parse(str, formatter);

										break;
									case 2:
										System.out.println("Enter the number of products you want to import");
										int no = scan.nextInt();
										Set<Products> set = new HashSet<Products>();
										importProducts(set, no);
										break;
									case 3:
										break outer;
									default:
										System.out.println("Enter valid choice!");
									}
								}
							} while (ch != 3);
						} else {
							System.out.println("Login failed. Employee Id or Password is wrong!!");
						}
						break;

					case 2:
						int custId;
						String pwd, custName;
						int opt;
						System.out.println("CUSTOMER LOGIN");
						System.out.println("Customer login using: 1.CustomerID\n2.Customer Name");
						opt = scan.nextInt();
						Customer cust;
						if (opt == 1) {
							System.out.print("Enter customer ID :\n");
							custId = scan.nextInt();
							System.out.print("\nEnter password :");
							pwd = scan.next();
							cust = b.customerLogin(custId, pwd);
						} else {
							System.out.print("Enter Customer Name :\n");
							custName = scan.next();
							System.out.print("\nEnter password :");
							pwd = scan.next();
							cust = b.customerLogin(custName, pwd);
						}
						if (cust != null) {
							System.out.println("You are successfully logged in");
							System.out.println("Enter your choice : 1.Show Orders\n 2.Show Invoice\n3.Main Menu");
						} else {
							System.out.println("Login failed. Customer Id or Password is wrong!!");
						}
						break;
					case 3:
						System.out.println("Are you sure you want to exit?   1.Yes\t2.No");
						int check;
						check = scan.nextInt();
						if (check == 1)
							System.exit(0);
						else
							break main;
					default:
						System.out.println("Enter valid choice!");
					}
				}
			} while (choice != 3);
		}
	}

	private static void importProducts(Set<Products> set, int no) {
		Scanner scan = new Scanner(System.in);
		int id;
		String name, category;
		double price;
		for (int i = 1; i <= no; i++) {
			System.out.println("Enter ProductID of item " + i);
			id = scan.nextInt();
			System.out.println("Enter Product Name of item " + i);
			name = scan.next();
			System.out.println("Enter Product Category of item " + i);
			category = scan.next();
			System.out.println("Enter Product Price of item " + i);
			price = scan.nextDouble();
		}
		System.out.println("Import of " + set.size() + " products successfully!!");
		System.out.println("Import of 0 products failed!!");

	}

}