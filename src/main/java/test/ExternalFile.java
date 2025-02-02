package com.qa.test;

import java.io.IOException;

public class ExternalFile {

	public static void main(String[] args) throws IOException, InterruptedException {

		Runtime runtime = Runtime.getRuntime();

		Process pr = runtime.exec("notepad.exe  C:\\Users\\priya\\OneDrive\\Desktop\\demofile.txt");
		Thread.sleep(3000);
		pr.destroy();

	}

}
