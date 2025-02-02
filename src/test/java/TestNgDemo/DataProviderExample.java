package TestNgDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sun.org.apache.bcel.internal.classfile.Method;

public class DataProviderExample {

	@Test(dataProvider = "data1")
	public void test1(int a, int b, int c) {
		int temp = a + b + c;
		System.out.println(temp);
	}

	@Test(dataProvider = "data2")
	public void test2(String userName, String password) {

		System.out.println(userName + "  " + password);

	}

	@DataProvider(name = "data1")
	public Object[][] getData1(Method m) {
		String methodName = m.getName();
		switch (methodName) {
		case "test1":
			return new Object[][] {

					{ 10, 30, 40 }, { 2, 4, 10 }, { 34, 3, 4 }

			};
		case "test2":

			return new Object[][] {

					{ "userName", "password" }, { "userName1", "password1" }, { "userName2", "password2" } };

		}
		return null;
	}

	@DataProvider(name = "data2")
	public Object[][] getData() {

		return new Object[][] {

				{ "userName", "password" }, { "userName1", "password1" }, { "userName2", "password2" } };
	}

}
