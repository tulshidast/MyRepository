package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	WebElement userNameTextBox;
	WebElement passwordTextBox;
	WebElement loginButton;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getUserNameTextBox() {
		return userNameTextBox;
	}

	public void setUserNameTextBox() {
		userNameTextBox = driver.findElement(By.id("txtUsername"));
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public void setPasswordTextBox() {
		this.passwordTextBox = driver.findElement(By.name("txtPassword"));
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton() {
		this.loginButton = driver.findElement(By.className("button"));
	}

}
