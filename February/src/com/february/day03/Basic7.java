package com.february.day03;

public class Basic7 {

	public static void main(String[] args) {
		int num[] = {3,4,5,8,4};
		int ele = 9;
		boolean found = false;
		for(int index = 0; index<num.length; index++) {
			if(num[index]==ele) {
				found = true;
				break;
	}

}
		if(found) {
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
}
}
