import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TakeScreenshotexamp {

	public WebDriver driver;
	public static String url = "https://www.facebook.com/";

	@Test
	public void setUp() {
		driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		WebElement loginbtn = driver.findElement(By.name("login"));

		// screenshot
		File fileSource = loginbtn.getScreenshotAs(OutputType.FILE);
		File target = new File("button.png");

		try {
			FileUtils.copyFile(fileSource, target);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
