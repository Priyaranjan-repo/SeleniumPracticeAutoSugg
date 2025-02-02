package com.qa.test;

public class LinkedList {

	public static void main(String[] args) {

		java.util.LinkedList<String> ls = new java.util.LinkedList<String>();

		ls.add("Puri");
		ls.add("Patna");
		ls.add("khurdha");

		for (int i = 0; i < ls.size(); i++) {

			System.out.println(ls.get(i));
		}

		ls.addFirst("Ranpur");
		ls.addLast("anuradha dress");
		System.out.println(ls);

		System.out.println("********************");

		// get
		System.out.println(ls.getFirst());
		System.out.println(ls.get(2));

		// set
		ls.set(1, "nilapur");
		System.out.println(ls);

		// remove
		System.out.println(ls.remove(1));
		System.out.println(ls.removeLast());
		// System.out.println(ls.removeAll(ls));

		System.out.println("***********************");
		for (int i = 0; i < ls.size(); i++) {

			System.out.println(ls.get(i));
		}

		System.out.println("uiang While lop");
		// while Loop
		int num = 0;
		while (ls.size() > num) {
			System.out.println(ls.get(num));
			num++;

		}

		System.out.println("Using Iterator ");

		/*
		 * Iterator<String> it = ls.iterator(); while (it.hasNext()) {
		 * System.out.println(it.hasNext()); }
		 */
		System.out.println("----------using forEach loop---------");
		for (String ss : ls) {
			System.out.println(ss);
		}
	}
}
