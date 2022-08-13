package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPage {
	WebDriver driver;
	WebElement longTimeTakenAlert;
	WebElement simpleAlertButton;

	public AlertPage(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getLongTimeTakenAlert() {
		return longTimeTakenAlert;
	}

	public void setLongTimeTakenAlert() {
		this.longTimeTakenAlert = driver.findElement(By.xpath("//*[@id='timerAlertButton']"));
	}

	public WebElement getSimpleAlertButton() {
		return simpleAlertButton;
	}

	public void setSimpleAlertButton() {
		this.simpleAlertButton = driver.findElement(By.xpath("//*[@id='promtButton']"));
	}

}
