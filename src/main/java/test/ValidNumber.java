package com.qa.test;

public class ValidNumber {

	public static void main(String[] args) {

		System.out.println(isNumber("122e"));

		System.out.println(isNumber("9087465343"));
		System.out.println(isNumber("90843"));
		System.out.println(isCorrecPhNumber("899e77e77e7"));
		System.out.println(isCorrecPhNumber("-647585996996"));

	}

	public static boolean isNumber(String number) {

		try {

			Long.parseLong(number);
			System.out.println("valid nunmber" + number);

		} catch (NumberFormatException e) {
			System.out.println("not a valid number" + number);

			return false;
		}
		return true;
	}

	public static boolean checkValidPhoneNo(String number) {

		if (number.length() == 10 && isNumber(number)) {
			System.out.println("valid nunmber" + number);
			return true;
		} else {
			System.out.println("not a valid number" + number);

		}
		return false;

	}

	public static boolean isCorrectNo(String number) {
		return number.matches("^(-?\\d+\\.)?-?\\d+$");

	}

	public static boolean isCorrectPhNumber(String number) {
		return number.matches("\\d{10}");

		// return number.matches("[0-9]{10}");

	}
}
