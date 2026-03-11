package com.february.day02;

public class FindNo {
public static void main(String args[]) {
	int marks[] = {4,5,-7,45,-6,10,-5};
	for(int index = 0; index < marks.length; index++ ) {
		int mark = marks[index];
		if(mark<0) {
			System.out.println(mark);
		}
	}
}
}
