package com.qa.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMaptoArrayList {

	public static void main(String[] args) {

		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("Ramesh", 190);
		hMap.put("Manu", 234);
		hMap.put("Gita", 567);

		System.out.println(hMap.size());

		Iterator it = hMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry) it.next();

			System.out.println(pairs.getKey() + " =  " + pairs.getValue());
		}

		// convert hasmap keys to arraylist
		List<String> li = new ArrayList<String>(hMap.keySet());
		System.out.println(li);

		for (String ss : li) {
			System.out.println(ss);

		}
		System.out.println("-----------------------------");

		// convert hasmap keys to arraylist
		List<Integer> listValues = new ArrayList<Integer>(hMap.values());
		for (Integer i : listValues) {
			System.out.println(i);
		}

	}
}
