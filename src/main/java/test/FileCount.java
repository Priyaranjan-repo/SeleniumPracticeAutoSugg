package com.qa.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCount {

	public static void main(String[] args) throws IOException {

		// public void fileReader(String path) {

		String path = "C:/Users/priya/OneDrive/Desktop/demofile.txt";

		int wordCount = 0;
		int lineCount = 0;
		int charCount = 0;

		BufferedReader reader;
		reader = new BufferedReader(new FileReader(path));

		String currLine = reader.readLine();

		while (currLine != null) {
			lineCount++;

			// split
			String word[] = currLine.split("");
			wordCount = wordCount + word.length;

			//
			for (String line : word) {
				charCount = charCount + line.length();

			}
			currLine = reader.readLine();

		}
		System.out.println("total word:" + wordCount);
		System.out.println("total lines: " + lineCount);

		System.out.println("total charCount:" + charCount);

	}
}
