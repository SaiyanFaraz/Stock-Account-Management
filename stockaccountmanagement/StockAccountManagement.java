package com.stockaccountmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StockAccountManagement {

	ArrayList<Stock> portfolioList = new ArrayList<Stock>();
	double totalValue = 0;
	
	public void addStock() {
		Stock stockInfo = new Stock();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Mention the Stock You Want to Purchase : ");
		System.out.println("Enter Share Name : ");
		stockInfo.setShareName(sc.next());
		
		System.out.println("Enter Number of Shares : ");
		stockInfo.setNumberOfShares(sc.nextInt());
		
		System.out.println("Enter Share Price : ");
		stockInfo.setSharePrice(sc.nextInt());	

		portfolioList.add(stockInfo);
		System.out.println();
		System.out.println("Stock Added");
	}
	
	public void addNoOfStocks() {
		System.out.println("Enter the number of Stocks you want to Purshase");
		Scanner sc = new Scanner(System.in);
		int noOfStocks = sc.nextInt();
		for (int i=1;i<=noOfStocks;i++) {
			addStock();
		}
	}

	public void totalValue() {
		for (Stock stock : portfolioList) {
			totalValue += stock.getSharePrice() * stock.getNumberOfShares();
		}
		System.out.println(totalValue);
	}
}

