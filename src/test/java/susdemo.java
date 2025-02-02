import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class susdemo {

	public WebDriver driver;
	public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	@BeforeTest
	public void setUp() {
		driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}

	@Test
	public void verify() {
		driver.findElement(By.xpath("//input[@name='username']")).clear();

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//button[@type='submit']")).submit();

		String pagetitle = driver.getTitle();

		if (pagetitle.equals("OrangeHRM")) {
			System.out.println("Login sucessful");

		} else {
			System.out.println("Login Failed");

		}

	}

	@AfterTest
	public void terDown() {
		driver.close();

	}

}
