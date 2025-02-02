package com.qa.test;

//is it possible call by referebce by java -yes by object reference.

public class CallByRef {

	int p;
	int q;

	public static void main(String[] args) {

		CallByRef call = new CallByRef();

		call.p = 30;
		call.q = 90;

		call.swap(call);
		// after swap
		System.out.println(call.p);
		System.out.println(call.q);

	}

	public int sum(int a, int b) {
		int temp = a + b;

		System.out.println(temp);
		return temp;

	}

	public void swap(CallByRef r) {
		int temp;
		temp = r.p;
		r.p = r.q;
		r.q = temp;

	}

}
