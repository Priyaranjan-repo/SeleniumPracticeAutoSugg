package com.qa.test;

public class Day2 {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;

		String x = "Hello";
		String y = "World";

		double f1 = 12.76;
		double f2 = 89.09;

		System.out.println(a + b);
		System.out.println(a + b + x + y);
		System.out.println(x + y + a + b);
		// HelloWorld100200
		System.out.println(x + y + (a + b));// HelloWorld200

		System.out.println(x + y + a + b + f1 + f2);// HelloWorld10020012.7689.09

		System.out.println("the valie of a:" + a);
		System.out.println("the value of f2: " + (f2 + a));
		System.out.print("hello java world");

	}

}
