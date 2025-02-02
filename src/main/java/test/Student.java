package com.qa.test;

import java.util.ArrayList;
import java.util.List;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> li = new ArrayList<String>();
		li.add("ramesh");
		li.add("Mahi");
		li.add("ram");
		li.add("ajay");
		li.add("saya");
		li.add("sanjay");

//		for (String ds : li) {
//			System.out.println(ds);
//		}

		li.stream().forEach(e -> System.out.println(e));

		System.out.println(isSubString("Ranjan enterment", "enterment"));
		System.out.println(isSubString("Groww festival", "Groww"));
		System.out.println(isSubString("Ranjan enterment  blog", "blog"));

	}

	public static boolean isSubString(String main, String sub) {
		return main.matches("(.*)" + sub + "(.*)");

	}

}
