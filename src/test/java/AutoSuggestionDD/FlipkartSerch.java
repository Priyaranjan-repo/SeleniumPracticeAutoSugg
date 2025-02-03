package AutoSuggestionDD;

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

public class FlipkartSerch {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		String url = "https://www.flipkart.com/";

		driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[contains(@class,'Pke_EE')]")).sendKeys("iphone ");
		Thread.sleep(3000);
		FlipkartSerch.get_Screenshot();

		List<WebElement> list = driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']"));
		int ddSuggetions = list.size();
		System.out.println(ddSuggetions);
		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i).getText().trim());
		}

	}

	public static void get_Screenshot() throws Exception {

		try {
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File(".//screenshot/test1.png"));
		} catch (WebDriverException e) {

			e.printStackTrace();
		}
	}
}
