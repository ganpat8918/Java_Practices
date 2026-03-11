package com.february.day09;

public class Payment {

	
		private int balance;
		private String name;
		
		public Payment(int balance, String name) {
			this.balance = balance;
			this.name = name;
		}
		public void doFundTransfer(int _amountToBeTransferred, String _pin)
		{
			if(_pin.equals("1234") && _amountToBeTransferred>0)
			{
				balance = balance+_amountToBeTransferred;
			}
			else {
				System.out.println("INvalid pin or -ve amount entered");
			}
		}
	}


