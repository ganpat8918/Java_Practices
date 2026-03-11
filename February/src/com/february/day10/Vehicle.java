package com.february.day10;

 class Vehicle {
	 int speed;
	 public static void main(String[] args) {
			Car v1 = new Car();
			v1.showSpeed(100);
		}
	 }
 class Car extends Vehicle{
	 public void showSpeed(int speed ) {
		 this.speed = speed;
		 System.out.println("Speed is: " + speed);	
	 }
 }
 
