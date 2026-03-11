package com.amazon.order;

public class Month {
	int startDate;
	int endDate;
	Month(){
		System.out.println("calling param constructor");
	}
	Month(int _startDate){
		this(_startDate, 30);
		System.out.println("calling param constructor2");
	}
	Month(int _startDate, int _endDate){
		this.startDate = _startDate;
		this.endDate = _endDate;
	}

	public static void main(String[] args) {
		Month m1 = new Month(3,34);
		System.out.println(m1.startDate + "\n" + m1.endDate + m1.endDate);
		Month m2 = new Month(36);

	}

}
