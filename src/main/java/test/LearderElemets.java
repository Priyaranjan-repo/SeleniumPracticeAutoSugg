package com.qa.test;

public class LearderElemets   {

	//int arr[] = { 92, 7, 12, 9, 8, 3 };
	//3 8 9 12 92
	
	public static void leaderElemts(int num[]) {

		int max = num[num.length - 1];
		System.out.print(max + " ");
		

		for (int i = num.length - 2; i >= 0; i--) {
			
			if (num[i] > max) {
				System.out.print(num[i] + " ");
				max = num[i];
			}

		}

	}

	public static void main(String[] args) {
		int arr[] = { 92, 7, 12, 9, 8, 3 };
		leaderElemts(arr);
	}

}
