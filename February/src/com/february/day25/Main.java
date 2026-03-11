package com.february.day25;
interface MyMarker{
	
}
class Student implements MyMarker{
	
}
public class Main {
	public static void main(String[] args) {
		Student s = new Student();
		if(s instanceof MyMarker) {
			System.out.println("yes");
		}else {
			System.out.println("NO");
		}
	}
}
