package com.orders;

public class Blocks {
	int qty;
	{
		qty = 20;
		System.out.println(qty);
	}
	static int price;
	static{
	 price = 100;
		System.out.println("I am inside static 1");
	}
	static {
		System.out.println("I am inside static 2");
	}
	public static void main(String args[]) {
		System.out.println("I am inside main method");
		System.out.println(price);
		
	}
}

