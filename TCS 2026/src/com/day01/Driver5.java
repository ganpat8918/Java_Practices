package com.day01;
class Sum{
	int number;
	int sum = 0;
	public void findSum(int _number) {
		this.number = _number;
		while(number!=0) {
			int digit = number%10;
			sum = sum + digit;
			number = number/10;
		}
		System.out.println("sum is: " + sum);
	}
}
public class Driver5 {

	public static void main(String[] args) {
		Sum s = new Sum();
		s.findSum(111111);
	}

}
