package com.day01;
class GCD{
	int number1, number2,min,factor;
	public void findGCD(int _number1, int _number2) {
		this.number1 = _number1;
		this.number2 = _number2;
		if(number1<number2) {
			min = number1;
		}else {
			min = number2;
		}
		for(int index = 1; index<=min; index++) {
			if(number1%index==0 && number2%index==0) {
				factor = index;	
			}
		}
		System.out.println("HCF is : "+factor);
		findLCM();
	}
	public void findLCM() {
		
		System.out.println("LCM is: "+ (number1*number2)/factor);
	}
}
public class Driver7 {
public static void main(String[] args) {
	GCD f = new GCD();
	f.findGCD(24, 9);
	
}
}
