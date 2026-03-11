package com.day01;
class LCM{
	int number1, number2, factor, max;
	public void findLCM(int _number1, int _number2) {
		this.number1 = _number1;
		this.number2 = _number2;
		if(number1>number2) {
			max = number1;
		}else {
			max = number2;
		}
		for(int index = 1; index<max; index++) {
			if(number1%index==0 && number2%index==0) {
				factor = index;
			}
		}
		System.out.println(factor);
	}
}
public class Driver8 {
public static void main(String[] args) {
	LCM l = new LCM();
	l.findLCM(4, 6);
}
}
