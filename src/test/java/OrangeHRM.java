import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class OrangeHRM {

	public static EdgeDriver driver;
	static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	@Test
	static void setUp() {
		driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		String emailValue = driver.findElement(By.name("username")).getDomProperty("Username");

		System.out.println(emailValue);
		getScreenshot();
	}

	static void getScreenshot() {

		File file = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("./screenshot/image1.png"));
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
