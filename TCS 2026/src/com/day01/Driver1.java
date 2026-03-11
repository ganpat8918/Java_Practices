package com.day01;
class PrimeNumber{
	int number;
	boolean find = true;
	public void checkPrime(int _number) {
		this.number = _number;
		if(number <=1) {
			find = false;
		}else {
			for(int index = 2; index<number; index++) {
				if(number%index==0) {
					find = false;
					break;
				}
				}
			}
		if(find == true) {
			System.out.println("is prime");
		}else {
			System.out.println("not prime");
		}
		}
	}

public class Driver1 {
	public static void main(String[] args) {
		PrimeNumber p = new PrimeNumber();
		p.checkPrime(4);
	}

}
