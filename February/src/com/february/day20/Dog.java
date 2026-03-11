package com.february.day20;
interface Animall{
	void sound();
	
}
 class Dog1 implements Animall {
	public void sound() {
		System.out.println("Dog barks");
	}
}
public class Dog{
	public static void main(String ar[]) {
		Dog1 d = new Dog1();
		d.sound();
	}
	
}
