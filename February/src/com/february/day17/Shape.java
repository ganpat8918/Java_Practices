package com.february.day17;

abstract class Shape {
	public static void main(String args[]) {
		Shape s1 = new Circle();
		s1.area(45);
		Shape s2 = new Rectangle();
		s2.area(55);
	}
	abstract void area(int a);
}
class Circle extends Shape{
	void area(int a) {
		System.out.println("Circle Area is :"+(2*22/7)*a);
	}
}
class Rectangle extends Shape{
	void area(int a) {
		System.out.println("Rectangle Area is :"+(2*22/7)*a);
	}
}