package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.paramedutech.pune.Utility;

public class BrowserNavCommand {

	@Test
	public void browserNavCommands() {
		WebDriver driver = Utility.getDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		System.out.println("Title: " + driver.getTitle());
		System.out.println("current url: " + driver.getCurrentUrl());
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
