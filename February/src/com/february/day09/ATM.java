package com.february.day09;

public class ATM {
private int actualPin = 145;
	 int triedPin;
	 int newPin;
	
	 
	public void triedPin(int triedPin) {
		this.triedPin = triedPin;
	}
	public void setPin( int newPin) {
		   
		if(triedPin == actualPin) {
			this.newPin = newPin;
			System.out.println("your new pin is: " + newPin);
		}else {
			System.out.println("You have enterd wrong pin. Try Again!");}
		}
	public static void main(String args[]) {
		ATM pin = new ATM();
		pin.triedPin(146);
		pin.setPin(123);	
	}
}

