package com.onlineapp.main;

import java.util.Scanner;

import com.onlineapp.business.BusinessLayer;

public class MainApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opt = 0;
		
		BusinessLayer businessLayer = new BusinessLayer();
		
		do {
			
			System.out.println("\n************ ORDER PROCESSING SYSTEM **************\n\n");
			System.out.println("------------------ HOME PAGE ------------\n");
			System.out.println("1.Employee Login\n2.Customer Login\n3.EXIT");
			System.out.println("\nChoose Option: ");
			opt = sc.nextInt();
			
			switch(opt) {
			
				case 1:
					break;
				case 2:
					break;
				case 3:
					opt = 3;
					System.out.println("\n\n------------ PROGRAM EXIT ----------\n\n");
					break;
				default:
					System.out.println("\n\nINVALID OPTION\n");			
			}
			
		} while (opt != 3);
		
	}

}
