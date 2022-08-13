package testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass {

	static Logger log = Logger.getLogger(ActionsClass.class);

	@Test
	public void advancedActions() {

		PropertyConfigurator.configure("log4j.properties");

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		log.debug("before open google .com");
		driver.get("https://www.google.com/");

		// Assert.assertEquals(driver.getTitle(), "amazon");
		log.info("after open google .com");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
		// Action
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
		element = driver.findElement(By.xpath("//input[@title='Search']"));
		actions.keyDown(element, Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).build().perform();
		actions.contextClick(element).build().perform();
	}

}
