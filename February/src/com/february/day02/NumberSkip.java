package com.february.day02;
public class NumberSkip {
	public static void main(String[] args) {
		int number = 20;
		for(int index = 1; index<=number; index++) {
			int temp = index;
			if(temp%2==0) {
				continue;
			}
			System.out.println(index);
		}
	}
}
