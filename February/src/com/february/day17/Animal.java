package com.february.day17;

abstract class Animal {
	public static void main(String args[]) {
		Animal a1 = new Dog();
		a1.sound();
		a1.sleep();
	}
	abstract void sound(); 
		
	void sleep() {
		System.out.println("Animal's sleep method");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("Dog's sound method");
	}
}
