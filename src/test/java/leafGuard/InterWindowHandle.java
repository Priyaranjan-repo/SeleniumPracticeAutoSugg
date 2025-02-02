package leafGuard;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InterWindowHandle {

	public static void main(String[] args) {

		String url = "https://www.leafground.com/window.xhtml;jsessionid=node0twy51b7koaylxu9tx7np699l8266873.node0";
		WebDriver driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		System.out.println("title: " + driver.getTitle());

		WebElement openDelaybtn = driver
				.findElement(By.xpath("//span[@class='ui-button-text ui-c'][text()='Open with delay']"));
		openDelaybtn.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

		wait.until(ExpectedConditions.numberOfWindowsToBe(3));

		String parentWindow = driver.getWindowHandle();

		System.out.println(parentWindow);

		Set<String> windows = driver.getWindowHandles();

		for (String child : windows) {
			System.out.println(child);

			if (!child.equals(parentWindow)) {
				driver.switchTo().window(child);
				driver.close();
			}
			driver.switchTo().window(parentWindow);

		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}

}
