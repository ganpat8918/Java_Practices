package com.february.day17;

public class Pay {
	int amount;
	public static void main(String args[]) {
		Pay p1 = new Pay();
		p1.pay(145);
		Pay p2 = new UPIPay();
		p2.pay(499);
		Pay p3 = new CreditCardPay();
		p3.pay(999);
		Pay p4 = new WalletPay();
		p4.pay(333);
	}
	public void pay(int amount) {
		this.amount = amount;
		System.out.println("Payment amount is: Rs "+ amount);
	}
}
class UPIPay extends Pay{
	public void pay(int amount) {
		this.amount = amount;
		System.out.println("UPI Payment amount is: Rs "+ amount);
	}
}
class CreditCardPay extends Pay{
	public void pay(int amount) {
		this.amount = amount;
		System.out.println("Credit Card Payment amount is: Rs "+ amount);
	}
}
class WalletPay extends Pay{
	public void pay(int amount) {
		this.amount = amount;
		System.out.println("Wallet Payment amount is: Rs "+ amount);
	}
}
