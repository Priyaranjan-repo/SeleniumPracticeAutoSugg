package com.qa.test;

public class CheckBinary {

	public static void main(String[] args) {

		binary(1001);

		binary(11100111);
	}

	public static void binary(int num) {

		boolean isBinary = false;
		int copyNumber = num;

		while (copyNumber != 0) {

			int rem = copyNumber % 10;
			if (rem > 1) {
				isBinary = false;
				break;
			} else {
				copyNumber = copyNumber / 10;

			}
		}

		if (isBinary) {
			System.out.println(num + "is binary number");
		} else {
			System.out.println(num + "is not binary number");
		}

	}
}
