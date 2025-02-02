package leafGuard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		String url = "https://www.leafground.com/select.xhtml";

		driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get(url);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement selectToolDD = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));

		Select select = new Select(selectToolDD);

		select.selectByContainsVisibleText("Playwright");

		driver.findElement(By.id("j_idt87:country")).click();

		String option = "Germany";

		WebElement ddCon = driver.findElement(By.xpath("//li[contains(text(),'" + option + "')]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ddCon.click();
		System.out.println("Country clicked");

		try {

			Thread.sleep(3000);

		} catch (InterruptedException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
		selectCountry();

	}

	public static void selectCountry() {

		WebElement countryDd = driver.findElement(By.xpath("//label[contains(.,'Select Country')]"));

		countryDd.click();

		String country = "India"; // Brazil Germany India USA

		WebElement countrybtn = driver.findElement(By.xpath("//li[contains(.,'" + country + "')]"));

		countrybtn.click();
		try {

			Thread.sleep(3000);

		} catch (InterruptedException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}

}
