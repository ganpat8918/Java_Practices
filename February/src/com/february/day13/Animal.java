package com.february.day13;

public class Animal {
	public static void main(String args[]) {
		Animal a = new Animal();
		a.Sound();
		Animal b = new Dog();
		b.Sound();
		
		
	}
	public void Sound() {
		System.out.println("Animal makes sound");
	}
}
