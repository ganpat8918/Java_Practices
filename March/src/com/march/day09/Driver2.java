package com.march.day09;

public class Driver2 {
	public static void main(String[] args) {
		try {
			int arr[] = {4,8,9,14};
			System.out.println(arr[2]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter within the range");
		}
	}

}
