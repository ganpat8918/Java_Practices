package com.february.day03;

public class Basic8 {

	public static void main(String[] args) {
		int num[] = {4,5,7,3,1,2};
		int sum = 0;
		for(int index = 1; index <num.length; index++) {
			if(index%2!=0) {
				sum = sum+num[index];
			}
			
	}
		System.out.println(sum);
}
}

