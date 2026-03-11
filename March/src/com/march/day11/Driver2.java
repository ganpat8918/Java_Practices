package com.march.day11;
import java.util.*;
public class Driver2 {

	public static void main(String[] args) {
		ArrayList<String> p = new ArrayList<String>();
		p.add("Banan");
		p.add("Mango");
		p.add("Grapes");
		p.add("Apple");
		p.add("Orange");
		
		p.set(2, "Cocomelon");
		if(p.contains("Banana")) {
			System.out.println("yes");
		}
		else {
			System.out.println("NO");
		}
		
	}

}
