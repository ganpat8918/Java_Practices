package com.day01;
class LeapYear{
	int year;
	public void checkLeapYear(int _year) {
		this.year = _year;
		if((year%400==0)||(year%4==0 &&year%100!=0)) {
			System.out.println("is a leap year");
	}else {
		System.out.println("not a leap year");
	}
}
}
public class Driver9 {
public static void main(String[] args) {
	LeapYear l = new LeapYear();
	l.checkLeapYear(24);
}
}

