package com.february.day09;

public class BankAccount1 {
	private static int balance;
	public void deposit(int amount) {
		balance = balance + amount;
	}
	public void withdraw(int amount) {
		balance = balance - amount;
	}
	public int depositBalance() {
		return balance;
	}
	public int withdrawBalance() {
		return balance;
	}
	public static void main(String args[]) {
		BankAccount1 b = new BankAccount1();
		b.deposit(1000);
		b.withdraw(50);
		System.out.println("Balance is :" + b.withdrawBalance() );
	}
}

