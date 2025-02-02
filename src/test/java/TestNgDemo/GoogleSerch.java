package TestNgDemo;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleSerch {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		String url = "https://www.google.com/";

		driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("iphone ");

		GoogleSerch.screenshotDemo();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {

			// list.get(i).getText().trim();

			System.out.println(list.get(i).getText().trim());

		}

	}

	public static void screenshotDemo() throws Exception {

		try {
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File(".//screenshot/test1.png"));
		} catch (WebDriverException e) {

			e.printStackTrace();
		}
	}
}