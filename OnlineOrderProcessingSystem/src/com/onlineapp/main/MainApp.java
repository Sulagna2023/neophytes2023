package com.onlineapp.main;

import java.util.Scanner;

import com.onlineapp.business.BusinessLayer;
import com.onlineapp.model.Customer;
import com.onlineapp.model.Employee;

public class MainApp {

	private static final int case1 = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BusinessLayer b =new BusinessLayer();
		Scanner scan = new Scanner(System.in);
		
		int choice;
		
		System.out.println("Welcome to the Application.\n Choose your category");
		System.out.println("1.Employee Login \n2.Customer Login");
		choice=scan.nextInt();
		
		switch(choice)
		{
			case 1: int empId,invoiceId;
					String pass;
					System.out.print("Enter employee ID :\n");
					empId = scan.nextInt();
					//System.out.println("");
					System.out.println("Enter password :");
					pass = scan.next();					
					Employee emp=b.employeeLogin(empId, pass);
					if(emp != null)
					{
						System.out.println("You are successfully logged in");
						//System.out.println("To see invoice enter invoice Id");
						//invoiceId=scan.nextInt();
						
					}
					else
					{
						System.out.println("Login failed. Employee Id or Password is wrong!!");
					}
					break;
					
			case 2: int custId;
					String pwd;
					System.out.print("Enter customer ID :\n");
					custId = scan.nextInt();
					System.out.print("\nEnter password :");
					pwd = scan.nextLine();					
					Customer cust=b.customerLogin(custId, pwd);
					if(cust == null)
					{
						System.out.println("You are successfully logged in");
						//System.out.println("To see invoice enter invoice Id");
						//invoiceId=scan.nextInt();
						
					}
					else
					{
						System.out.println("Login failed. Customer Id or Password is wrong!!");
					}
					break;
		}
		

	}

}