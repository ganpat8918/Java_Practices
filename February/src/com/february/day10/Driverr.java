package com.february.day10;

 class Customerr {
	public void buy() {
		System.out.println("Customer.buy()");
	}
}
class SilverCustomer extends Customerr{
	public void buy() {
		System.out.println("SilverCustomer.buy()");
	}
}
public class Driverr{
	public static void main(String args[]) {
		SilverCustomer cust1 = new SilverCustomer();
		cust1.buy();
		Customerr cust2 = new SilverCustomer();
		cust2.buy();
	}
}
