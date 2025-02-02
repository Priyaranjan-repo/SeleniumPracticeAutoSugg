package TestNgDemo;

import org.testng.annotations.Test;

public class DataProviderExamp {

	@Test(dataProvider = "data1", dataProviderClass = MyDataProvider.class)
	public void sum(int a, int b, int c) {
		int result = a + b + c;
		System.out.println(result);
	}

}