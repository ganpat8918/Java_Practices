package com.february.day09;

public class Book {
	private static String title, author;
	private static int price;
	public Book(String _title) {
		this.title = _title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getauthor() {
		return author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public static void main(String args[]) {
		Book b = new Book("Ramayana");
		b.setAuthor("Ramsagar");
		b.setPrice(111);
		System.out.println("Title: " + b.title + "\nPrice: " + b.getPrice() + "\nAuthor: " + b.getauthor());
		Book b1 = new Book("Mahabharath");
		b1.setAuthor("Ganesh ji");
		b1.setPrice(222);
		System.out.println("Title: " + b.title + "\nPrice: " + b.getPrice() + "\nAuthor: " + b.getauthor());
	}
}
