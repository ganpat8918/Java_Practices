package com.february.day03;

public class Basic5 {

	public static void main(String[] args) {
		int num[] = {4,5,7,3,1,2};
		int largest = 0;
		for(int index = 0; index <num.length; index++) {
			 int _num = num[index];
			 if(_num>largest) {
				 largest = _num;
			 }
		}
		System.out.println(largest);
	}

}
