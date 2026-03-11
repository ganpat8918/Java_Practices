package com.february.day02;

public class Week {
	
	public static void main(String args[]) {
		Week w1 = new Week();
		int DayNo ;
		switch(1) {
		case 1:
			System.out.println("Day is monday");
			break;
		case 2:
			System.out.println("Day is tuesday");
			break;
		case 3:
			System.out.println("Day is wednesday");
			break;
		case 4:
			System.out.println("Day is thursday");
			break;
		case 5:
			System.out.println("Day is friday");
			break;
		case 6:
			System.out.println("Day is saturday");
			break;
		case 7:
			System.out.println("Day is sunday");
			break;
			default:
				System.out.println("Enetr valid range from 1 to 7");
				break;
		}
	}
}
