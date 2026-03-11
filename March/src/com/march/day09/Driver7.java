package com.march.day09;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class Driver7 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("file.docx");
			System.out.println("File opened successfully");
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}

}
