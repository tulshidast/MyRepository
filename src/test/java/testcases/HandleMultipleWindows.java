package testcases;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.paramedutech.pune.Utility;

public class HandleMultipleWindows {

	@Test
	public void handleWindows() {
		WebDriver driver = Utility.getDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/browser-windows");
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		// getting current window handle
		String currentWindowHandle = driver.getWindowHandle();

		// opening new window
		driver.findElement(By.xpath("//button[contains(@id,'windowButton')]")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		for (String windowHandle : windowHandles) {
			if (!(windowHandle.equals(currentWindowHandle))) {
				driver.switchTo().window(windowHandle);

				System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
				driver.close();
			}

		}
		driver.switchTo().window(currentWindowHandle);
		driver.findElement(By.xpath("//button[contains(@id,'windowButton')]")).click();
	}

}
