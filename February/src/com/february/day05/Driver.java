package com.february.day05;

public class Driver {

	public static void main(String[] args) {
		String s10 = "Hello ";
		String s11 = "Bangalore";
		String s12 = s10+s11;
		String s13 = s12.intern();
		System.out.println(s13);
	}

}
