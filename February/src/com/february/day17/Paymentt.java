package com.february.day17;

interface Paymentttt{
	public abstract void pay(int amount, String accNo);
	public abstract void stopPayment(int paymentId);
}

public class Paymentt {
	public void pay() {
		dbConnect();
		validateUser();
		checkBalance();
		checkLimit();
		doTxn();
	}
	private void dbConnect() {
		
	}
    private void validateUser() {
		
	}
    private void checkBalance() {
	
}
    private void checkLimit() {
	
}
    private void doTxn() {
	
    }
	
}
