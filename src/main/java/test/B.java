package com.qa.test;

public class B extends A {

	public B() {
		// super(10);
		super();
		System.out.println("child class constructor");
	}

	public B(int i, int j) {
		super(i);
		System.out.println("child class const.");
	}

	public static void main(String[] args) {

		B b = new B();
		B b1 = new B(10, 20);

	}

}
