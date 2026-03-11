package com.orders;
	class VehicleParent{
		int _speed ;
		VehicleParent(){
			System.out.println("Vehicle Created");
			}
		void display() {
			System.out.println("I am inside parent class");
		}
	}
public class Vehicle extends VehicleParent {
	int speed = 60;
	Vehicle(){
		super._speed = 100;
		System.out.println(_speed);
		super.display();
	}
	public static void main(String args[]) {
		Vehicle v1 = new Vehicle();
	}
}
