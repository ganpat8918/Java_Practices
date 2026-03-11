package com.orders;

public class MarkingScheme {
	public static void main(String args[]) {
	int percentage = 93;
	if(percentage > 33 && percentage < 41) {
		System.out.println("Pass");
	}else if(percentage > 40 && percentage < 51) {
		System.out.println("E");
	}else if(percentage > 50 && percentage < 61) {
		System.out.println("D");
	}else if(percentage > 60 && percentage < 71) {
		System.out.println("C");
	}else if(percentage > 70 && percentage < 81) {
		System.out.println("B");
	}else if(percentage > 80 && percentage < 91) {
		System.out.println("A");
	}else if(percentage > 90 && percentage <= 100) {
			System.out.println("A+");

}
	}
}
