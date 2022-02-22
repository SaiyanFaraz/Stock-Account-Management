package com.stockaccountmanagement;

public class Stock {
	private String shareName;
	private int sharePrice;
	private int numberOfShares;

	public String getShareName() {
	    return shareName;
	}
	
	public void setShareName(String shareName) {
		this.shareName = shareName;
	}

	public int getNumberOfShares() {
	    return numberOfShares;
	}
	
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	
	public int getSharePrice() {
		return sharePrice;
	}
	
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	@Override
	public String toString() {
		return "Stock [shareName=" + shareName + ", sharePrice=" + sharePrice + ", numberOfShares=" + numberOfShares
				+ "]";
	}
	
}

