package TestNgDemo;

import org.testng.annotations.DataProvider;

public class MyDataProvider {

	@DataProvider(name = "data1")
	public Object[][] getData() {

		return new Object[][] {

				{ 1, 4, 6 }, { 11, 42, 16 }, { 18, 24, 26 } };

	}
}
