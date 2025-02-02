package com.leafguard;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupl {

	public static void main(String[] args) {
		String str = "Saghamitra";

		StringBuilder sb = new StringBuilder();

		Set<Character> set = new HashSet();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (!set.contains(ch)) {
				set.add(ch);
				sb.append(ch);

			}

		}
		System.out.println(sb.toString());

	}

}
