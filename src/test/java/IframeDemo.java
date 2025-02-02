import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class IframeDemo {

	public static void main(String[] args) {

		String url = "https://demo.automationtesting.in/Frames.html";
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		driver.switchTo().frame(driver.findElement(By.cssSelector("#singleframe")));
		driver.findElement(By.xpath("//input")).sendKeys("iframe text");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
		driver.switchTo().frame(
				driver.findElement(By.xpath("//div[@class='iframe-container']/iframe[@src='SingleFrame.html']")));
		driver.findElement(By.xpath("//input")).sendKeys("nested iframe");

		String actualTitle = driver.getTitle();
		System.out.println(actualTitle); // Frames
		String expectedTitle = "https://demo.automationtesting.in/Frames.html";

		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
