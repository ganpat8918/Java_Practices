package com.february.day13;

public class Parent {
	public void doTask() {
		System.out.println("I am parent's class method!");
	}
	 public static void main(String args[]) {
		 Parent e = new Child();
		 e.doTask();
		
		 Child c1 = (Child) new Parent();
		 c1.doTask();
		 
		 Child c = (Child) e;
		 e.doTask();
	 }
}
 class Child extends Parent{
	
	public void doTask() {
		System.out.println("I am child's class method!");
	}
}
