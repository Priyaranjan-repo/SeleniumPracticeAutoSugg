import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {

	public WebDriver driver;
	public static String url = "https://www.saucedemo.com/";

	@BeforeTest
	public void setUp() {
		driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}

	// To Fill A Form In A One Statement using Actions
	@Test
	public void verify() {
		Actions act = new Actions(driver);
		Action seriesActions = act.moveToElement(driver.findElement(By.id("user-name"))).click()
				.sendKeys("standard_user", Keys.TAB).sendKeys("secret_sauce", Keys.ENTER).build();
		seriesActions.perform();

	}

}
