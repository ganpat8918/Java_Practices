package com.march.day09;

public class InsufficientBalanceException extends Exception {
	int balance;
	InsufficientBalanceException(int _balance, int _transferAmount){
		balance = _balance;
	}
}
