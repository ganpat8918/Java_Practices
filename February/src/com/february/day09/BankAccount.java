package com.february.day09;

public class BankAccount {
	private int balance;
	public void setBalance(int balance) {
		balance = 1000;
	}
	public int getBalance() {
		return balance;
	}
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		System.out.println("Blance is : " + b1.getBalance());
	}

}
