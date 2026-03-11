package com.february.day20;
interface Bank{
	int RATE = 5;
	void showRate();
}
class SBI implements Bank{
	public void showRate() {
		System.out.println(RATE);
	}
}
public class Main2 {
public static void main(String[] args) {
	SBI s = new SBI ();
	s.showRate();
	}

}
