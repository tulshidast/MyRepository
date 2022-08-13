package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.paramedutech.pune.Utility;

public class HowToHandleFrame {
	WebDriver driver;

	@Test
	public void handleFrame() {
		driver = Utility.getDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(element);
		String str = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(str);
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//header/a")).getAttribute("href"));

	}

}
