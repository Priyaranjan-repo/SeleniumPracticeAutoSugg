package com.qa.test;

import java.util.Set;

public class TreeMap {

	public static void main(String[] args) {

		java.util.TreeMap<Integer, String> trMap = new java.util.TreeMap<Integer, String>();

		trMap.put(1000, "maruti");
		trMap.put(2000, "toyata");

		trMap.put(3900, "kia");

		trMap.put(7000, "mg");
		System.out.println(trMap);

		trMap.forEach((k, v) -> System.out.println("key  =" + k + " value =" + v));

		System.out.println(trMap.lastKey());
		System.out.println(trMap.firstKey());

		Set<Integer> keyles3k = trMap.headMap(2000).keySet();
		System.out.println(keyles3k);

	}

}
