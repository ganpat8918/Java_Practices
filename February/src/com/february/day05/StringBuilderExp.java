package com.february.day05;

public class StringBuilderExp {

	public static void main(String[] args) {
		String s1 = "I am from Bangalore India";
		String arr[] = s1.split(" ");
		
		int length = 0;
		for(String word : arr) {
			System.out.println(word);
			length = length + word.length();		
			}
		System.out.println(length);
	}
}
