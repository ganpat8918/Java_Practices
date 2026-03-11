package com.february.day09;

public class Person {
	private int age;
	public void setAge(int age) {
		if(age>0 &&age <120) {
			this.age = age;
		}
		else {
			System.out.println("Enter valid age!");
		}
	}
	public int getAge() {
		return age;
	}
	public static void main(String args[]) {
		Person p = new Person();
		p.setAge(121);
		System.out.println("Age is :" + p.getAge());
	}
}
