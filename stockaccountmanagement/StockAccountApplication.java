package com.stockaccountmanagement;

import java.util.Scanner;

public class StockAccountApplication {
		static StockAccountManagement a = new StockAccountManagement();
		public static void main(String[] args) {

			int choice = 0;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your choice \n1: Add Stock \n2: Add Multiple of Stocks "
						           + "\n3: Display Total value of Stocks \n0: Exit ");
				choice = sc.nextInt();
				while (choice < 4) {
				switch (choice) {
				case 0:
					System.out.println("Exit");
					a.totalValue();
					break;
				case 1:
					a.addStock();
					break;
				case 2:
				    a.addNoOfStocks();
					break;
				case 3:
					System.out.println("Total value of your stocks is : ");
					a.totalValue();
					break;
				default:
					System.out.println("Please enter right choice");
				}
			}
			
		}
	}
