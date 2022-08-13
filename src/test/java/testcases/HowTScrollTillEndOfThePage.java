package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import com.paramedutech.pune.Utility;

public class HowTScrollTillEndOfThePage {
	@Test
	public void scrollTillEnd() throws InterruptedException {
		WebDriver driver = Utility.getDriver();
		// Thread.sleep(10000);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("(//button)[3]")).click();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(7));
		wait.pollingEvery(Duration.ofMillis(2));
		wait.ignoring(NoSuchElementException.class);
		
		// JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;

		wait.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();
		// javascriptExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
