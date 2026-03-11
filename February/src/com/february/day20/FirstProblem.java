package com.february.day20;
abstract class Animal{
	abstract void sound();
}
class Lion extends Animal{
	public void sound() {
		System.out.println("Lion roars");
	}
}
class Tiger extends Animal{
	public void sound() {
		System.out.println("Tiger roars");
	}
}
public class FirstProblem {

	public static void main(String[] args) {
		Lion l = new Lion();
		l.sound();
		Tiger t = new Tiger();
		t.sound();
	}
}
