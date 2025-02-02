package com.qa.test;

import java.util.HashMap;
import java.util.Map;

public class NumberToString{

	public static void main(String[] args) {
		int input = 123456;
		String output = convertToString(input);
		System.out.println("Output: " + output);
	}

	public static String convertToString(int num) {
		// Map to store words for odd digits
		Map<Integer, String> oddWords = new HashMap<>();
		oddWords.put(1, "one");
		oddWords.put(3, "three");
		oddWords.put(5, "five");
		oddWords.put(7, "seven");
		oddWords.put(9, "nine");

		// StringBuilder to build the result
		StringBuilder result = new StringBuilder();

		// Convert the number to string to iterate over each digit
		String numStr = String.valueOf(num);

		for (char ch : numStr.toCharArray()) {
			int digit = Character.getNumericValue(ch);

			// Append the word if odd, or the digit itself if even
			if (oddWords.containsKey(digit)) {
				result.append(oddWords.get(digit));
			} else {
				result.append(digit);
			}
		}

		return result.toString();
	}

}
