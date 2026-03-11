package com.february.day17;

public class Payment {
	int amount;
	public static void main(String args[]) {
		Payment p1 = new CreditCardPayment();
		p1.Payment(1000);
        Payment p2 = new UPIPayment();
        p2.Payment(500);
        Payment p3 = new WalletPayment();
        p3.Payment(300);
             
	}
	void Payment(int amount) {
		this.amount = amount;
        System.out.println("Processing payment of :Rs" + amount);
    }
}
class CreditCardPayment extends Payment {
    void Payment(int amount) {
    	this.amount = amount;
        System.out.println("Processing Credit Card payment of :Rs" + amount);
    }
}
class UPIPayment extends Payment {
    void Payment(int amount) {
    	this.amount = amount;
        System.out.println("Processing UPI payment of :Rs" + amount);
    }
}
class WalletPayment extends Payment { 
    void Payment(int amount) {
    	this.amount = amount;
        System.out.println("Processing Wallet payment of :Rs" + amount);
    }
}

