package com.qa.test;

public class Constructerexmple {

	String name;
	int salary;
	private String name1;

	public static void main(String[] args) {
		Constructerexmple con = new Constructerexmple("Akash", 20000);
		Constructerexmple con1 = new Constructerexmple("Miyta");
		Constructerexmple con2 = new Constructerexmple(34, 231);
		System.out.println(con.salary);
		System.out.println(con.name);
	}

	// no return any value
	public Constructerexmple(String name, int salary) {

		this.salary = salary;
		this.name = name;

	}

	public Constructerexmple(String name1) {

		this.name1 = name1;

	}

	public Constructerexmple(int age, int ids) {

		this.salary = age;
	}
}
