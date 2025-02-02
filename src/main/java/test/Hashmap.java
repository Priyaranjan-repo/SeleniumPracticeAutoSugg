package com.qa.test;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hashmap {

	public static void main(String[] args) {

		Map<String, Integer> hs = new HashMap<String, Integer>();
		hs.put("", null);

		Map<Object, Object> map = Stream
				.of(new AbstractMap.SimpleEntry<>("Ranjan", "java"), new AbstractMap.SimpleEntry<>("rahul", "c"))

				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(map.get("Ranjan"));

	}

}
