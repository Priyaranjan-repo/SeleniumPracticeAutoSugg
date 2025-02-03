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
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutoSuggestion {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		String url = "https://www.flipkart.com/";

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// driver.findElement(By.name("q")).sendKeys("air conditioners ");

		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("shoes ");

		Thread.sleep(3000);

		FlipkartAutoSuggestion.getScreenshot();

		List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,'YGcVZO _2VHNef')]"));

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {

			String value = list.get(i).getText().trim();

			System.out.println(value);

		}

	}

	public static void getScreenshot() throws Exception {

		try {
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File(".//screenshot/test2.png"));

		} catch (WebDriverException e) {

			e.printStackTrace();
		}
	}
}