package com.qa.test;

public class LocalGlobalVar {

	int age = 45; // global variable
	String mob = "12737839080";
	String color = "white";

	public static void main(String[] args) {

		String rev = "";// local

		LocalGlobalVar lc = new LocalGlobalVar();
		System.out.println(lc.age);
		System.out.println(lc.color);
		System.out.println(lc.mob);
		M1();

	}

	public static void M1() {

		System.out.println("hjdjd");
	}

}
