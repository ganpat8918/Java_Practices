package com.day01;
class Reverse1{
	String name,reverse = " ";
	public void reverseString(String _name) {
		this.name = _name;
		for(int index= name.length()-1; index>=0; index--) {
			reverse = reverse + name.charAt(index);
		}
		System.out.println(reverse);
	}
}
public class Driver10 {
public static void main(String[] args) {
	Reverse1 r = new Reverse1();
	r.reverseString("hello");
}
}
