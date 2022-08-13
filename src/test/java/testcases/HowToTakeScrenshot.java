package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.paramedutech.pune.Utility;

public class HowToTakeScrenshot {
	WebDriver driver;

	@Test
	public void verifyAlert() throws InterruptedException, IOException {
		this.driver = Utility.getDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
		File file=takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:/Users/Administrator/classworkspace/com.paramedutech.pune/src/test/resources/scr.png"));

}
}
