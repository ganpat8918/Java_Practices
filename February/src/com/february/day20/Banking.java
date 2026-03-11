package com.february.day20;

abstract class Banking {
Banking(){
	super();
}
public void addPayee(String payeeName) {
	
}
public abstract void pay();
public abstract void settle();
}
class HDFC extends Banking{
	HDFC(){
		System.out.println("HDFC's method in HDFC class");
	}

	@Override
	public void pay() {
		System.out.println("pay method in Banking class");
	}

	@Override
	public void settle() {
		
	}
}
