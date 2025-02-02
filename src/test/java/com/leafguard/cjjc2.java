package com.leafguard;

import java.util.Arrays;

public class cjjc2 {

	public static void main(String[] args) {
		String str = "Saghamitra@@13t674u45536))))";

		String[] alpha = str.split("[^a-z]");
		System.out.println(Arrays.toString(alpha));

		String[] nos = str.split("[^0-9]+");
		System.out.println(Arrays.toString(nos));

		// StringBuilder sb = new StringBuilder();

		// str.chars().distinct().forEach(e->sb.append(char)e));
	}

}
