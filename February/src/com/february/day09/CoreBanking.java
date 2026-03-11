package com.february.day09;

public class CoreBanking {
	public void doFundTransfer()
	{
		System.out.println("coreBanking.doFundTransfer()");
	}
	public void stopCheque()
	{
		System.out.println("coreBanking.stopCheque()");
	}
	private void changePassword()
	{
		System.out.println("coreBanking.changePassword()");
	}

	public static void main(String[] args) {
		SBIUPI s1 = new SBIUPI();
		s1.setBalance(1000);
		SBINEFT s2 = new SBINEFT();
		s2.setBalance(5000);
		System.out.println("UPI Balance: " + s1.getBalance());
		System.out.println("NEFT Balance: " + s2.getBalance());
		
	}

}
