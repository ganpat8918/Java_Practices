package com.february.day20;
interface A{
	void showA();
	default void pay() {
		System.out.println("Default's pay method");
	}
}
interface B {
	void showB();
}
class D implements A , B{
	public void showA() {
		System.out.println("Interface A: Show A method");
	}
	public void showB() {
		System.out.println("Interface B: Show B method");
		pay();
	}
}
public class Main3 {
	public static void main(String[] args) {
	D d = new D();
	d.showA();
	d.showB();
	
	}	
}
