package testcases;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.paramedutech.pune.Utility;

import pages.MainPage;

public class SelectDateFromDatePicker {

	MainPage mainPage;
	WebDriver driver;

	@Test
	public void verifySelectDateFromDatePicker() throws InterruptedException {
		this.driver = Utility.getDriver();
		mainPage = new MainPage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.get("https://demoqa.com/automation-practice-form");
		mainPage.setUserNameTextBox();
		WebElement userTextBox1 = mainPage.getUserNameTextBox();
		userTextBox1.sendKeys("USer1");
		Thread.sleep(1000);
		userTextBox1.clear();
		Thread.sleep(1000);
		userTextBox1.sendKeys("USer1");
		System.out.println(userTextBox1.getCssValue("background-color"));
		
		Dimension d= userTextBox1.getSize();
		System.out.println( d.getHeight());
		System.out.println( d.getWidth());
		System.out.println(userTextBox1.getAttribute("placeholder"));
		mainPage.setMaleRadioButton();
		
		System.out.println("before Male radio button selected: "+mainPage.getMaleRadioButton().isSelected());
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", mainPage.getMaleRadioButton());
		
		System.out.println(" after Male radio button selected: "+mainPage.getMaleRadioButton().isSelected());
		System.out.println("Is displayed: "+mainPage.getMaleRadioButton().isDisplayed());
		System.out.println("Is enabled: "+mainPage.getMaleRadioButton().isEnabled());
		mainPage.setDatePickerTextBox();

		Utility.scrillIntoView(driver, mainPage.getDatePickerTextBox());
		mainPage.getDatePickerTextBox().click();
		mainPage.setYearDropDown();
		Select select = new Select(mainPage.getYearDropDown());
		select.selectByValue("2020");
		Utility.setDate("14", driver);
		mainPage.setHobiesCheckBox();
		executor.executeScript("arguments[0].click();", mainPage.getHobiesCheckBox());

		mainPage.setUploadFile();
		mainPage.getUploadFile().sendKeys(
				"C:\\Users\\Administrator\\classworkspace\\com.paramedutech.pune\\src\\test\\resources\\users.properties");
	}

}
