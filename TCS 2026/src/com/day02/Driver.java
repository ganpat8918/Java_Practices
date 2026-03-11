package com.day02;
class SecondLargest{
	int number []= {};
	int largest =0, secondLargest=0;
	public void findSecondLargest(int[] _number) {
		this.number=_number;
		for(int index = 0; index<number.length; index++) {
			number[0]=largest;
			number[0]= secondLargest;
			if(number[index]> largest) {
				secondLargest = largest;
				largest = number[index];
			}else if(number[index]>secondLargest && number[index]!=largest) {
				secondLargest = number[index];
			}
		}
		System.out.println(secondLargest);
	}
}
public class Driver {

	public static void main(String[] args) {
		SecondLargest s = new SecondLargest();
		int arr[]= {4,7,2,9,3};
		s.findSecondLargest(arr);
	}

}
