package com.february.day03;

public class Basic4 {

	public static void main(String[] args) {
		int num[] = {4,5,4,3,1,7};
		int sum = 0;
		float avg ;
		for(int index = 0; index <num.length; index++) {
			 sum  = sum  +num[index];
			 
		}
		avg = sum/num.length;
		System.out.println(avg);
	}

}
