package com.qa.test;

public class FindPercntage {

	public static void main(String[] args) {

		String str = "Ranjan Das 1234 %#";
		getPercntage(str);
	}

	public static void getPercntage(String str) {

		int len = str.length();
		int digits = 0;
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int spcalchar = 0;

		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				upperCaseCount++;

			} else if (Character.isLowerCase(ch)) {
				lowerCaseCount++;
			} else if (Character.isDigit(ch)) {
				digits++;
			} else {
				spcalchar++;
			}
		}

		double upperCasePercentage = (upperCaseCount * 100.0) / len;
		double lowerCasePercentage = (lowerCaseCount * 100.0) / len;
		double digitPercentage = (digits * 100.0) / len;
		double specCharPercentage = (spcalchar * 100.0) / len;

		System.out.println("Given string :" + str);

		System.out.println("upper case % ----->" + upperCasePercentage);
		System.out.println("lower case % ----->" + lowerCasePercentage);
		System.out.println("digit % ----->" + digitPercentage);
		System.out.println("speclchar % ----->" + specCharPercentage);

	}
}
