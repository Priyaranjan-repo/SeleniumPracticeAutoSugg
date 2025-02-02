package com.leafguard;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Constant {

	public static WebDriver driver;

	public static WebDriver getDriver() {

		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		return driver;
	}

	public static void getScreenShot() {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy-hh-MM-ss");

			String fileName = System.getProperty("user.dir") + "/screenshot/" + sdf.format(new Date()) + ".png";
			System.out.println(fileName);

			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(file, new File(fileName));
		} catch (Exception e) {

		}
	}

}
