package com.february.day09;
public class Rectangle {
	private static int length;
	private static int width;
	 static int area;
	public void setLength(int _length) {
		this.length = _length; 
	}
	public void setWidth(int _width) {
		this.width = _width;
	}
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	public void getArea() {
		System.out.println("Area is: "+length*width);
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setLength(10);
		r1.setWidth(20);
		r1.getArea();
        }
}
