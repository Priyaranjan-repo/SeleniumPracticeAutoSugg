package com.qa.test;

import java.util.Iterator;

public class LinkedListdj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create linkedlist
		java.util.LinkedList<String> animals = new java.util.LinkedList<>();

		// add() method without the index parameter
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		System.out.println("LinkedList: " + animals);

		// add() method with the index parameter
		animals.add(1, "Horse");
		System.out.println("Updated LinkedList: " + animals);

		animals.addFirst("Rat");
		animals.addLast("Monkey");
		System.out.println(animals);
		animals.addAll(3, animals);
		System.out.println(animals);
		animals.removeFirst();
		System.out.println(animals);
		System.out.println(animals.indexOf(5));

		Iterator<String> it = animals.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		System.out.println("--------------------------");
		Iterator<String> itr = animals.descendingIterator();
		while (itr.hasNext()) {
			String ss = itr.next();
			System.out.println(ss);

		}

	}
}
