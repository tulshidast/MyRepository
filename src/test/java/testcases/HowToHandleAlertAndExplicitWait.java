package testcases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.paramedutech.pune.Utility;

import pages.AlertPage;

public class HowToHandleAlertAndExplicitWait {

	AlertPage alertPage;
	WebDriver driver;

	@Test
	public void verifyAlert() throws InterruptedException {
		this.driver = Utility.getDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		
		
		alertPage = new AlertPage(driver);
		alertPage.setLongTimeTakenAlert();
		Utility.scrillIntoView(driver, alertPage.getLongTimeTakenAlert());
		alertPage.getLongTimeTakenAlert().click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(6));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(alert.getText());
		alert.accept();
		
//		alertPage.setSimpleAlertButton();
//		Utility.scrillIntoView(driver, alertPage.getSimpleAlertButton());
//		alertPage.getSimpleAlertButton().click();
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("This is alert");
//		Thread.sleep(5000);
//		System.out.println(alert.getText());
//		alert.dismiss();

	}

}
