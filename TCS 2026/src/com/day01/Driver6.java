package com.day01;
class Largest{
	int number1, number2, number3, largest;
	public void findLargest(int _number1,int _number2,int _number3) {
		this.number1 = _number1;
		this.number2 = _number2;
		this.number3 = _number3;
		if(number1>number2 && number1>number3) {
			System.out.println("largest no is: " + number1);
		}else if(number2>number1 && number2>number3) {
			System.out.println("largest no is: " + number2);
		}else {
			System.out.println("largest no is " + number3);
		}
	}
}
public class Driver6 {

	public static void main(String[] args) {
		Largest l = new Largest();
		l.findLargest(80, 40, 1000);
	}

}
