package com.february.day10;

 class Payment {
	public int calculateGST(int amount) {
		System.out.println("GST for the amount is :");
		int GST = (amount*18)/100;
		return GST;
	}
}
class Transaction extends Payment{
	@Override
	public int calculateGST(int amount) {
		System.out.println("GST for the amount is :");
		int GST = (amount*12)/100;
		return GST;
	}
}
public class Driver1{
	public static void main(String[] args) {
		Driver1 p = new Driver1();
		

	}

}

