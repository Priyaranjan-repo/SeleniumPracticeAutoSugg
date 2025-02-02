package com.selenium;
import java.awt.Color;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ColorsVerify {

	

		public static WebDriver driver;
		public static String url = "https://www.flipkart.com/account/login?ret=/";

		
//public static void main(String[] args) {
	
@Test
		public void setUp() {
			driver = new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			
			String colorName = driver.findElement(By.xpath("//*[@class='QqFHMw twnTnD _7Pd1Fp']")).getCssValue("background");
		
			System.out.println("--------bg color -----"+colorName);
			
			
			String textColor = driver.findElement(By.xpath("//*[@class='W5mR4e']")).getCssValue("color");
			
			System.out.println("--------text color -----"+textColor);
			
			
			
			String borderColor = driver.findElement(By.xpath("//*[contains(text(),'Request OTP')]")).getCssValue("border");
			
			System.out.println("--------border color -----"+borderColor);
			
			
			
		

			
			
}
}

