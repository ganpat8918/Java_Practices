package com.february.day13;

public class Device {
	public static void main(String[] ar) {
		SmartPhones s = new SmartPhones();
		s.PhoneSmart();
		s.powerOn();
		s.phone();
	}
	public void powerOn() {
		System.out.println("Power on method");
	}
}

class Mobile extends Device{
	public void phone() {
		System.out.println("Phone method");
	}
}

class SmartPhones extends Mobile{

	public void PhoneSmart() {
		System.out.println("Phone smart method");
	}
}

