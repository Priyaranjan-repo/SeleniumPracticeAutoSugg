package com.qa.test;

public class ExceptionHandling {

	public static void main(String[] args) {

		/*
		 * ExceptionHandling hs = new ExceptionHandling(); hs = null;
		 * System.out.println(hs.a);
		 */

		try {
			int d = 5 / 0;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}
		System.out.println("asc");
	}

}
