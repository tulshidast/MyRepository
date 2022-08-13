package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.paramedutech.pune.Utility;

import pages.LoginPage;

public class LoginFunctinality {
	WebDriver driver;
	LoginPage loginPage;

	@Test
	public void verifyValidLogin() throws InterruptedException {
		this.driver = Utility.getDriver();
		this.loginPage = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//driver.get(Utility.getValue("url"));
		driver.manage().window().maximize();
		loginPage.setUserNameTextBox();
		WebElement userNameTextBox = loginPage.getUserNameTextBox();
		userNameTextBox.sendKeys("Admin");
		userNameTextBox.clear();
		Thread.sleep(10000);
		userNameTextBox.clear();
		Thread.sleep(10000);
		userNameTextBox.sendKeys("Admin");
		loginPage.setPasswordTextBox();
		loginPage.getPasswordTextBox().sendKeys("admin123");
		loginPage.setLoginButton();
		loginPage.getLoginButton().click();
		WebElement element=driver.findElement(By.xpath("//b[text()='PIM']//parent::a"));
		element.click();
		Actions actions=new Actions(driver);
		//actions.moveToElement(element);
		driver.findElement(By.linkText("Employee List")).click();
		WebElement selectDropdown=driver.findElement(By.xpath("//select[@id='empsearch_employee_status']"));
		Select select=new Select(selectDropdown);
		select.selectByVisibleText("Part-Time Contract");
		List<WebElement> list=select.getOptions();
		for(WebElement elm:list)
		{
			System.out.println(elm.getText());
		}
		//select.deselectByVisibleText("Part-Time Contract");
		driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_54']")).click();
        System.out.println(driver.getPageSource());
	}

}
