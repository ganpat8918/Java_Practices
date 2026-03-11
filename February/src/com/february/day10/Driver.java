package com.february.day10;
class Parent{
	public void doSomething() {
		System.out.println("Parent.doSomething()");
	}
}
class Child extends Parent{
	public void doSomething() {
		System.out.println("Child.doSomething()");
	}
}
public class Driver {
	public static void main(String args[]) {
		Parent p = new Parent(); // parent can refer child object
		p.doSomething();
		Child c = new Child();
		c.doSomething();
	}
}
