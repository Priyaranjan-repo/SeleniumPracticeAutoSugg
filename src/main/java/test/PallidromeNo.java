package com.qa.test;

public class PallidromeNo {

	public static void isPallidromeNo(int n) {
		int temp;
		int r;
		int sum = 0;
		int t = n;

		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (t == sum) {
			System.out.println("pallindrome");
		} else {
			System.out.println("not pallindrome");
		}
	}

	public static void main(String[] args) {
		isPallidromeNo(121);
		isPallidromeNo(221);

	}
}
