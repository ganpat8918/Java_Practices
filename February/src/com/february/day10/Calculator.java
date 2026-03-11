package com.february.day10;

public class Calculator {
public	int a;
public	int b;
public static void main(String args[]) {
	Calculator c = new Calculator();
	c.add(1, 2);
	AdvanceCalculator a = new AdvanceCalculator();
	a.multiply(4, 5);
}
	public void add(int a, int b) {
		System.out.println("sum is :" + (a+b));
	}
}
class AdvanceCalculator extends Calculator {
	public static void main(String args[]) {
		AdvanceCalculator a = new AdvanceCalculator();
		a.add(4, 5);
		a.multiply(4, 5);
	}
	public void multiply(int a, int b) {
		System.out.println("Product is :" + a*b);
	}
	
}
