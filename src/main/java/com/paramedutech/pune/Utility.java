package com.paramedutech.pune;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {

	String value = null;

	public String getValue(String key) {
		try {
			File file = new File(
					"C:\\Users\\Administrator\\classworkspace\\com.paramedutech.pune\\src\\test\\resources\\users.properties");
			FileInputStream fileInputStream = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fileInputStream);
			this.value = (String) properties.get("chromeDriverPath");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Class\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;

	}

	public static void setDate(String str, WebDriver driver) {
		driver.findElement(By.xpath("//div[text()='" + str + "']")).click();

	}

	public static void scrillIntoView(WebDriver driver, WebElement element) {
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
