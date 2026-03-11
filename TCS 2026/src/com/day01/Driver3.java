package com.day01;
class Fibonacci{
	int number;
	int num1 = 0, num2 = 1;
	public void findFibonacci(int _number) {
		this.number = _number;
		for(int index=0; index<=number; index++) {
			System.out.print(num1+ " ");
			int num3 = num1+num2;
			num1 = num2;
			num2 = num3;
		}
	}
}
public class Driver3 {

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		f.findFibonacci(5);
	}

}
