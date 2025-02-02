package com.qa.test;

public class StringCaptalCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ThiSHHDJDDKFKK jfkgkglgl GSGFDTDTDrrstsysdidprogram";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count++;

			}

		}
		System.out.println(count);

	}

}

//A= 65 Z=90 iusde
//use uppercase