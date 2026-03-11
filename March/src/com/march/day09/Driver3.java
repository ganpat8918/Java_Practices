package com.march.day09;
public class Driver3 {
	public static void main(String[] args) {
		try {
			int num1=10, num2=5;
			int div = num1/num2;
			System.out.println(div);
		}
		catch(ArithmeticException e) {
			System.out.println("invalid ");
		}
		finally{
			System.out.println("Executed successfully");
		}
	}
}
