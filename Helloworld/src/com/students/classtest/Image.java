package com.students.classtest;

public class Image {
	String category;
	int duration;
	int price;
	Image(String _category,int _duration, int _price){
		category = _category;
		duration = _duration;
		price = _price;
		}
	void display() {
		System.out.println("Category :" + category);
		System.out.println("Duration" + duration);
		System.out.println("Price :" + price);
		System.out.println("______________");
	}
}
