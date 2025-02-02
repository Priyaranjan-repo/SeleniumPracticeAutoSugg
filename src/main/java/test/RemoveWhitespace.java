package com.qa.test;

public class RemoveWhitespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " this is java  program ";
		System.out.println(str.trim()); // this is java program

		String sp[] = str.split("\\s");
		System.out.println(sp);

		System.out.println(str.replaceAll("\\s+", ""));

		// split
		String newArr[] = str.split("\\s");
		StringBuffer sb = new StringBuffer();
		for (String ss : newArr) {

			sb.append(ss);

		}
		System.out.println(sb);
	}
}
