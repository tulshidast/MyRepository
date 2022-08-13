package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

	WebDriver driver;

	WebElement userNameTextBox;
	WebElement maleRadioButton;
	WebElement datePickerTextBox;
	WebElement yearDropDown;
	WebElement uploadFile;
	WebElement hobiesCheckBox;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUserNameTextBox() {
		return userNameTextBox;
	}

	public void setUserNameTextBox() {
		this.userNameTextBox = driver.findElement(By.xpath("//input[@id='firstName']"));
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public void setMaleRadioButton() {
		this.maleRadioButton = driver.findElement(By.xpath("//input[@value='Male']"));
	}

	public WebElement getDatePickerTextBox() {
		return datePickerTextBox;
	}

	public void setDatePickerTextBox() {
		this.datePickerTextBox = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
	}

	public WebElement getYearDropDown() {
		return yearDropDown;
	}

	public void setYearDropDown() {
		this.yearDropDown = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
	}

	public WebElement getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile() {
		this.uploadFile = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
	}

	public WebElement getHobiesCheckBox() {
		return hobiesCheckBox;
	}

	public void setHobiesCheckBox() {
		this.hobiesCheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	}

}
