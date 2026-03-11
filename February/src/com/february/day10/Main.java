package com.february.day10;

 class Animal {
	 void eat() {
		System.out.println("can Eat");
	}
}

	 class Dog extends Animal{
		 void bark() {
			System.out.println("can Bark");
		}
	}
	
	public class Main{
		public static void main(String args[]) {
		Dog d1 = new Dog();
		d1.eat();
		d1.bark();

	}

}

