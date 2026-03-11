package com.day01;
class Factorial{
	int number;
	int factorial=1;
	public int checkFactorial(int _number) {
		this.number = _number;
		if(number <=1) {
			return number;
			
		}else {
			for(int index = 1;index<=number; index++) {
				factorial = factorial*index;
				
			}
		}
		return factorial;
	}
	
	public void display() {
		System.out.println(factorial);
	}
}
public class Driver2 {
	public static void main(String[] args) {
	
	Factorial f = new Factorial();
	f.checkFactorial(0);
	f.display();
	}
}
