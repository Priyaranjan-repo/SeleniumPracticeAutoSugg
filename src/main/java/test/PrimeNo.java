package com.qa.test;

public class PrimeNo {

	public static void main(String[] args) {

		System.out.println(primeNo(27));

		getPrimeNo(20);

	}

	public static boolean primeNo(int nums) {

		if (nums <= 1) {
			return false;
		}

		for (int i = 2; i < nums; i++) {
			if (nums % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void getPrimeNo(int nums) {

		for (int i = 2; i <= nums; i++) {
			if (primeNo(i)) {
				System.out.println(i + " ");

			}
		}
	}
}
