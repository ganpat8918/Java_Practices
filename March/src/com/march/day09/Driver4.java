package com.march.day09;

public class Driver4 {

	public static void main(String[] args) {
		try {
			int num1=8, num2=0;
			int arr[]= {4,8,9,7};
			System.out.println(arr[5]);
			try {
				int res = num1/num2;
				System.out.println(res);
			}
			catch(ArithmeticException e) {
				System.out.println("invalid division");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter valid range");
		}
		
		
	}

}
