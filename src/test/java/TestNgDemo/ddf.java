package TestNgDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ddf {

	@Test(expectedExceptions = AssertionError.class, expectedExceptionsMessageRegExp = "Testing failed")

	public void test1() {
		System.out.println("test1");

		Assert.assertEquals(1, 2);

	}

	@Test(priority = 1, alwaysRun = true)
	public void test2() {
		System.out.println("test1");

	}
}
