package TestNgDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {

	public WebDriver driver;
	public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	@BeforeTest
	@Parameters({ "browser" })
	public void launchBrowser(String browser) {
		switch (browser.toLowerCase()) {

		case "chrome":
			driver = new ChromeDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			driver = null;

			break;
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

	}

	@AfterMethod
	public void afterTest() {
		driver.quit();
		driver = null;
	}

	@Test
	public void verifyTitle(String title) {

		String actualtitle = driver.getTitle();
		String expectedTile = "OrangeHRM";
		Assert.assertEquals(expectedTile, actualtitle);
	}
}
