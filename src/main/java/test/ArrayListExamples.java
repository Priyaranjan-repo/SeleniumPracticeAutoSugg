package com.qa.test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();

		al.add(12);
		al.add("tyia");
		al.add("mitu");

		System.out.println(al.get(0));
		System.out.println(al.get(2));
		// System.out.println(al.get(4)); // index 4 out of bounds for length 3

		// generic
		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(12);
		arr.add(456);
		arr.add(908);

		for (Integer i : arr) {
			System.out.println(" " + i);
		}

		System.out.println("---------------------------------------");
		Employee emp = new Employee("Bbsr", "Mita", 28);
		Employee emp1 = new Employee("Chikago", "Jhon", 38);
		Employee emp2 = new Employee("USA", "Mike", 25);

		ArrayList<Employee> al2 = new ArrayList<Employee>();

		al2.add(emp);
		al2.add(emp2);
		al2.add(emp1);

		Iterator<Employee> itr = al2.iterator();
		while (itr.hasNext()) {
			Employee e = itr.next();
			System.out.println(e.address);
			System.out.println(e.name);
			System.out.println(e.age);

		}
		// addAll()
		ArrayList<String> als = new ArrayList<String>();
		als.add("rfy");
		als.add("Train");
		als.add("Flight");

		ArrayList<String> als1 = new ArrayList<String>();
		als1.add("rfyy");
		als1.add("Train1");
		als1.add("Flight2");

		als.addAll(als1);

		for (int i = 0; i < als.size(); i++) {
			System.out.println(als.get(i));

		}
		// remove all
		als.removeAll(als1);

		for (int i = 0; i < als1.size(); i++) {
			System.out.println(als.removeAll(als1));

		}

		System.out.println("********************************************");

		// retainAll
		ArrayList<String> a4 = new ArrayList<String>();
		a4.add("rfyy1");
		a4.add("Puri SF");
		a4.add("Flight2");

		ArrayList<String> a5 = new ArrayList<String>();
		a5.add("rfyy");
		a5.add("Puri SF");
		a5.add("Flight21");

		a4.retainAll(a5);
		for (int i = 0; i < a4.size(); i++) {
			System.out.println(a4.get(i));

		}
	}

}
