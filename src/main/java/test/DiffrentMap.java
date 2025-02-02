package com.qa.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DiffrentMap {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("Ramesh", "c++");
		map.put("Manu", "Java");
		map.put("Gita", "Python");

		Map<String, String> syncMap = Collections.synchronizedMap(map);

		System.out.println(syncMap);

		// create concuurentMap

		ConcurrentHashMap<String, String> connMap = new ConcurrentHashMap<String, String>();
		connMap.put("trial", "bike");
		connMap.put("drive", "car");
		connMap.put("Fast", "tarin");

		System.out.println(connMap.get("trail"));

	}

}
