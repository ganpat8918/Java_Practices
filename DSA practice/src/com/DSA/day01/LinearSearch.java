package com.DSA.day01;

public class LinearSearch {
	public static void main(String[] args) {
		int [] arr = {4,7,6,11,44,58};
		int key = 11;
		boolean found = false;
		for(int index = 0; index<arr.length; index++) {
			if(arr[index]==key) {
				System.out.println("Element found at index "+ index);
				found = true;
				break;
			}
			}
		if(!found) {
			System.out.println("Not found");
		}
}
}
