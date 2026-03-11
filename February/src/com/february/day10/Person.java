package com.february.day10;

public class Person {
	String name = "Ganesh";
	int age = 25;
	public static void main(String args[]) {
		Student s = new Student();
		s.displayDetails1();
		
	}
}
class Student extends Person{
	int rollNo = 4;
	void displayDetails1(){
		System.out.println("Your name is :" + name);
		System.out.println("\nYour age is :" + age);
		System.out.println("\nYour RollNo is :"+ rollNo);
	}
}
