import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class bootStarp {
	public static WebDriver driver;

	public static void main(String[] args) {

		String url = "https://www.jquery-az.com/boots/demo.php?ex=63.0_2";
		driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

		driver.findElement(By.xpath("//input[@value='csharp']")).click();

		// seelct multiple options checkbox

		List<WebElement> listchbox = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li"));

		System.out.println("No of checkboxes:" + listchbox.size());

		for (WebElement optionlist : listchbox) {
			String op = optionlist.getText();
			if (op.equals("Java") || op.equals("Python") || op.equals("Oracle")) {

				optionlist.click();

			}
			System.out.println(optionlist.getText());

			progLang();
		}

	}
	// span[contains(text(),'Full-Time Contract')]//ogm

	// print all only option
	// //span[contains(@class,'multiselect-native')]//option

	// print option son specific group

	public static void progLang() {

		// select only java
		// span[contains(@class,'multiselect-native')]//optgroup[2]//option[text()='Java']

		List<WebElement> listLang = driver
				.findElements(By.xpath("//span[contains(@class,'multiselect-native')]//optgroup[2]//option"));
		for (WebElement option : listLang) {

			option.click();

			System.out.println(option.getText());

		}
	}
}
