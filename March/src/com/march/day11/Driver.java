package com.march.day11;
import java.util.*;
public class Driver {
public static void main(String[] args) {
	int sum = 0;
	ArrayList<Integer> n = new ArrayList<Integer>();
	n.add(4);
	n.add(77);
	n.add(65);
	n.add(44);
	n.add(21);
	n.remove(2);
	for(int index = 0; index<n.size(); index++) {
		
		sum = sum + n.get(index);
	}
	System.out.println(sum);
}
}
