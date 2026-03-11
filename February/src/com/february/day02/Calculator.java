package com.february.day02;

public class Calculator {
	public static void main(String args[]) {
		int num1 = 4;
		int num2 = 5;
		int sum = 1;
		int sub = 2;
		int multiply = 3;
		int division = 4;
		switch(2) {
		case 1:
			sum = num1+num2;
			System.out.println(sum);
			break;
		case 2:
			sub = num1-num2;
			System.out.println(sub);
			break;
		case 3:
			multiply = num1*num2;
			System.out.println(multiply);
			break;
		case 4:
			division = num1%num2;
			System.out.println(division);
			break;
			default:
				break;
			
		}
	}
}
