package com.bridgelab.genericprograms;

import java.util.Scanner;

public class MaximumNumber<E extends Comparable<E>> {
	public static int MAX;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Java Generic Programms");
		MaximumNumber maximumNumber=new MaximumNumber();
		maximumNumber.testMaximumIntegerNumber();
		System.out.println("maximum integer number:"+MAX);
	}
	
	public int testMaximumIntegerNumber() {
		Scanner sc=new Scanner(System.in);
		Test<Integer> number=new Test<Integer>();
		System.out.println("Enter a first number:");
		number.setNumber1((sc.nextInt()));
		System.out.println("Enter a second number:");
		number.setNumber2((sc.nextInt()));
		System.out.println("Enter a third number:");
		number.setNumber3((sc.nextInt()));
		MAX=number.getNumber1();
		if(number.getNumber2().compareTo(MAX)>0) {
			MAX=number.getNumber2();
		}
		if(number.getNumber3().compareTo(MAX)>0) {
			MAX=number.getNumber3();
		}
		return MAX;
	}	
}
