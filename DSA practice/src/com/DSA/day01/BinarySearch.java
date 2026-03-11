package com.DSA.day01;

public class BinarySearch {
public static void main(String[] args) {
	int [] arr = {4,6,8,10,14,20};
	int key = 10;
	int start = 0, end = arr.length-1;
	boolean found = false;
	while(start<=end) {
		int mid = (start+end)/2;
		if(arr[mid] == key) {
			System.out.println("Element found" + mid);
			found = true;
			break;
		}else if(arr[mid]<key){
			start = mid+1;
		}else {
			end = mid-1;
		}
	}
		if(!found) {
			System.out.println("Not found");
		}
	}
}

