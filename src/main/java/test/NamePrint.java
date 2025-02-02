package com.qa.test;

public class NamePrint {

	public static void main(String[] args) {

		String d = "Ranjan";

		String d1 = "i";
		d1 = d1.replaceAll("i", "iiiiiiiiii");
		d1 = d1.replaceAll("i", "iiiiiiiiii");
		d1 = d1.replace("i", d + "\n");
		System.out.println(d1);

	}

}
