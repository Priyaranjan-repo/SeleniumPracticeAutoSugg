package com.leafguard;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Auth {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.leafground.com/auth.xhtml";
		WebDriver driver = Constant.getDriver();

		driver.get(url);

		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();

		String parentWindow = driver.getWindowHandle();

		Set<String> windows = driver.getWindowHandles();

		for (String windo : windows) {
			if (!windo.equals(parentWindow)) {
				driver.switchTo().window(windo);
				break;
			}
		}
		String authURL = "leafground.com:8090/login";
		String username = "admin";
		String password = "testleaf";
		driver.get("http://" + username + ":" + password + "@" + authURL);
		Thread.sleep(3000);
		Constant.getScreenShot();
		Assert.assertTrue(driver.getPageSource().contains("Your authentication is successful"));
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(parentWindow);
		driver.quit();
	}

}
