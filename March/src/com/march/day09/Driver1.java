package com.march.day09;

public class Driver1 {
	public static void main(String[] args) {
		try {
		int num1=5, num2 = 5, num3 = 0;
		int div[] = { num1/num2, num1*num2};
		
		System.out.println(div[3]);
		int res = num1/num3;
		System.out.println(res);
		
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("out of range");
	}
		catch(ArithmeticException e) {
			System.out.println("invalid ");
		}

}
}
