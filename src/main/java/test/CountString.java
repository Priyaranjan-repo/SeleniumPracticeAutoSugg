package com.qa.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountSt("java is langauage and best is  java");
		CountSt("this is new java program new java program");
	}

	public static void CountSt(String s) {

		String word[] = s.split(" ");
		int len = s.length();

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String ch : word) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);

			}
		}

		Set<String> set = map.keySet();
		for (String word1 : set) {
			if (map.get(word1) > 1) {
				System.out.println(word1 + " : " + map.get(word1));
			}

		}
	}
}
