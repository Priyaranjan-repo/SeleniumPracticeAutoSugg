package com.selenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class scroll {

	public static WebDriver driver;
	public static String url = "https://www.calculator.net/";

	@Test
	public static void name() {
		driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		JavascriptExecutor jse1 = (JavascriptExecutor) driver;

		try {

			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		jse1.executeScript("window.scrollBy(0,500)");// scroll down by 500 verticall
	}

}
