package com.qa.test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNo {

	public static void main(String[] args) {

		// Runtime runtime = Runtime.getRuntime();

		Random rd = new Random();

		for (int i = 0; i <= 5; i++) {

			System.out.println("random int :" + rd.nextInt());
			System.out.println("random boolean: " + rd.nextBoolean());
			System.out.println("random double :" + rd.nextDouble());
			System.out.println("random decimal :" + rd.nextFloat());

		}
		System.out.println("===========================");
		for (int i = 0; i <= 5; i++) {
			System.out.println(Math.random());
			System.out.println(Math.PI);
			System.out.println(Math.E);

		}
		System.out.println("using threadlocalrandom");
		System.out.println("random int :" + ThreadLocalRandom.current().nextInt());
		System.out.println("random boolean: " + ThreadLocalRandom.current().nextBoolean());
		System.out.println("random double :" + ThreadLocalRandom.current().nextFloat());
		System.out.println("random decimal :" + ThreadLocalRandom.current().nextFloat());

	}

}
