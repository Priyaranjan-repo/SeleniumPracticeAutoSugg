import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cookies {

	public WebDriver driver;
	public static String url = "https://www.amazon.in/";

	@BeforeTest
	public void setUp() {
		driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}

	@Test
	public void verify() {
		Set<Cookie> allcookies = driver.manage().getCookies();

		System.out.println(allcookies.size());

		for (Cookie ck : allcookies) {
			System.out.println(ck.getName() + " : " + ck.getValue());

		}
	}

//	@AfterTest
//	public void terDown() {
//		driver.close();

}
