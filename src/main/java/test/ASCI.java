package com.qa.test;

public class ASCI {

	public static void main(String[] args) {

		String num = "124";

		convertToInt(num);

	}
	/*
	 * int i = 45;
	 * 
	 * int i1 = Integer.parseInt(num);
	 * 
	 * System.out.println(i1); }
	 */

	/*
	 * String strNumber = Integer.toString(number) String strNumber =
	 * String.valueOf(number); String strNumber = String.format("%d", number); int
	 * num = 42; sb.append(num); // Convert StringBuilder to String String strNum =
	 * sb.toString();
	 */

	public static int convertToInt(String str) {
		if (str.length() == 1) {
			return (int) str.charAt(0) - 48;
		}

		char[] ch = str.toCharArray();
		int sum = 0;
		int zeroAsc = (int) '0';
		for (int i = 0; i < ch.length; i++) {
			int asc = (int) ch[i];
			sum = sum * 10 + (asc - zeroAsc);

		}
		return sum;
	}
}
