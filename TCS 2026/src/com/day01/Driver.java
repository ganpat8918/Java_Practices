package com.day01;
	class CheckNumber{
		 long number;
		public void checkOddEven(long _number) {
			this.number = _number;
			if(number ==0) {
				System.out.println("neither odd nor prime");
			}else if(number%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}
	}
public class Driver {

	public static void main(String[] args) {
		CheckNumber c = new CheckNumber();
		c.checkOddEven(1000000000);
	}

}
