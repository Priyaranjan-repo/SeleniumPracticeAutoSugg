package com.qa.test;

public class ifElse {

	public static void main(String[] args) {

		int a = 5;
		int b = 10,

				c = 90;

		if (b >= a) {
			System.out.println("print b:" + b);

		} else {
			System.out.println("print a:" + a);

		}

		// nested if -else
		int a1 = 205;
		int b1 = 67;
		int c1 = 200;

		if (a1 > b1 & a1 < c1) {

			System.out.println("print a1:" + c1);

		} else if (a1 > c1) {
			System.out.println("print c1:" + a1);
		} else {
			System.out.println("print b1");
		}
	}
}
