package com.bridgelab.genericprograms;

import java.util.Scanner;

public class MaximumNumber<E extends Comparable<E>> {
	public static int MAX;
	public static float MAX1;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Java Generic Programms");
		MaximumNumber maximumNumber=new MaximumNumber();
		maximumNumber.testMaximumIntegerNumber();
		System.out.println("maximum integer number:"+MAX);
		maximumNumber.testMaximumFloatNumber();
		System.out.println("maximum float number:"+MAX1);
	}
	
	public int testMaximumIntegerNumber() {
		Scanner sc=new Scanner(System.in);
		Test<Integer> number=new Test<Integer>();
		System.out.println("Enter a first integer number:");
		number.setNumber1((sc.nextInt()));
		System.out.println("Enter a second integer number:");
		number.setNumber2((sc.nextInt()));
		System.out.println("Enter a third integer number:");
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
	
	public Float testMaximumFloatNumber() {
		Scanner sc=new Scanner(System.in);
		Test<Float> number=new Test<Float>();
		System.out.println("Enter a first float number:");
		number.setNumber1((sc.nextFloat()));
		System.out.println("Enter a second float number:");									
		number.setNumber2((sc.nextFloat()));
		System.out.println("Enter a third float number:");
		number.setNumber3((sc.nextFloat()));								
		MAX1=number.getNumber1();
		if(number.getNumber2().compareTo(MAX1)>0) {
			MAX1=number.getNumber2();
		}
		if(number.getNumber3().compareTo(MAX1)>0) {
			MAX1=number.getNumber3();
		}
		return MAX1;
	}
}
