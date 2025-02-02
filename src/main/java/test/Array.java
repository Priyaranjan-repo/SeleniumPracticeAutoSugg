package com.qa.test;

public class Array {

	public static void main(String[] args) {

		/*
		 * int a[] = new int[5];
		 * 
		 * a[0] = 10; a[1] = 12; a[3] = 34;
		 */

		String a[][] = new String[3][4];
		a[0][0] = "W";
		a[0][1] = "r";
		a[0][2] = "W";
		a[0][3] = "r";
		// 2nd row

		a[1][0] = "W2";
		a[1][1] = "r1";
		a[1][2] = "W3";
		a[1][3] = "r13";
		// 3rd row
		a[2][0] = "W20";
		a[2][1] = "r21";
		a[2][2] = "W32";
		a[2][3] = "r113";

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {

				System.out.print(" " + a[row][col]);

			}

		}
	}

}
