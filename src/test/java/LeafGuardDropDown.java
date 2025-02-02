import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LeafGuardDropDown {

	static EdgeDriver driver;

	@Test
	static void dropDownTest() throws Exception {

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

		Thread.sleep(3000);

		driver.findElement(By.xpath("//label[contains(.,'Select City')]")).click();
		String cityName = "Frankfurt"; // Munich

		WebElement cityDD = driver.findElement(By.xpath("//li[contains(text(),'" + cityName + "')]"));

		cityDD.click();
		System.out.println("city clicked");

		String ddvalue = "Appium";
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='j_idt87:auto-complete_input']")).sendKeys(ddvalue + Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='j_idt87:auto-complete_input']")).sendKeys("RestAssured" + Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//h5[contains(text(),'Choose the Course')]")).click();

		driver.findElement(By.xpath("//label[contains(text(),'Select Language')]")).click();
		String lang = "English";

		WebElement langDD = driver.findElement(By.xpath("//li[contains(text(),'" + lang + "')]"));
		langDD.click();
		System.out.println("Language clicked");
		Thread.sleep(2000);

		WebElement value = driver.findElement(By.xpath("//label[contains(.,'Select Values')]"));

		value.click();
		String value1 = "Three";
		Thread.sleep(2000);
		WebElement valueDD = driver.findElement(By.xpath("//li[contains(text(),'" + value1 + "')]"));
		valueDD.click();
		System.out.println("value clicked");

	}

}
