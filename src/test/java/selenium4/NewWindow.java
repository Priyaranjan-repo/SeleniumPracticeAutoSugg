package selenium4;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class NewWindow {

	public static WebDriver driver;
	public static String url = "https://www.google.com/";

	@Test
	public static void name() {
		driver = new EdgeDriver();
		driver.get(url);

		String winId = driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		// driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		driver.switchTo().window(winId);
		System.out.println(driver.getTitle());
	}

}
