package com.february.day10;

public class Customer {
	public void buyProduct(String productName)
	{
		System.out.println("Customer.buyProduct().. Buying product..");
	}
}
class GoldCustomer extends Customer {
	private void doSomething(){
		GoldCustomer cust = new GoldCustomer();
	}
}