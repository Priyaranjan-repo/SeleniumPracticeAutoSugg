package com.qa.test;

import java.awt.geom.Arc2D.Double;

public class NullFact {

	public static void main(String[] args) {

		// instace of
		Integer i = null;
		Integer j = 10;
		System.out.println(j instanceof Integer);
		System.out.println(i instanceof Integer);

		// static vs non static
		NullFact obj = null;
		// obj.get();
		sum();

		// = and !=
		System.out.println(null == null);
		System.out.println(null != null);
		// 6.
		String s1 = null;
		Integer i1 = null;
		// Double d1=null;
		String s2 = (String) null;
		System.out.println(s2 + "123");
		System.out.println(s1.charAt(0));

		Integer i2 = (Integer) null;
		Double d2 = (Double) null;

	}

	public static void sum() {
		System.out.println("sum----------------");

	}

	public void get() {
		System.out.println("get.............");

	}

}
