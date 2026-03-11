package com.march.day09;

public class Trans extends Driver {
int balance = 1000;
int transferAmount;
	public void doTransfer(int _transferAmount) {
		this.transferAmount = _transferAmount;
		try {
			if(transferAmount>balance) {
				throw new InvalidAgeException("Insufficient funds");
			}else {
				System.out.println("transferred successfully");
			}
		}
		catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}
