package com.qa.test;

public class Factorial {

	public static void main(String[] args) {

		fact(5);

		System.out.println(factorial(4));
	}

	public static void fact(int n) {

		// int n = 6; // 5!=5*4*3*2
		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		System.out.println(fact);

	}

//with recursive - a function called itself
	public static int factorial(int num) {
		if (num == 0) {
			return 1;
		} else
			return (num * (factorial(num - 1)));
	}
}
