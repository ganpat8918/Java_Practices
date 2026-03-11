package com.day01;
class Reverse{
	int number;
	int reverse = 0;
	int original;
	public int findReverse(int _number) {
		this.original = _number;
		number = original;
		while(number!=0) {
			int digit = number%10;
			reverse = reverse*10+digit;
			number = number/10;
		}
		return reverse;
	}
	public void getReverse() {
		if(reverse==original) {
		System.out.println("is pallindrome");
		}
		else {
			System.out.println("not pallindrome");
		}
		}
}
public class Driver4 {

	public static void main(String[] args) {
		Reverse r = new Reverse();
		r.findReverse(123);
		r.getReverse();
	}

}
