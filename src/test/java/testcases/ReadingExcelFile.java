package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.paramedutech.pune.Utility;

public class ReadingExcelFile {
	
	@Test
	public void readXlsFile() throws IOException,FileNotFoundException
	{
		
		//driver.findElement(By.linkText("SIGN-OFF")).click();
		
		
		File file=new File("C:\\Users\\Administrator\\Desktop\\myfile.xls");
		FileInputStream fileInputStream=new FileInputStream(file);
		
		
		HSSFWorkbook hssfWorkbook=new HSSFWorkbook(fileInputStream);
		HSSFSheet sheet = hssfWorkbook.getSheet("Sheet1");
		int lastRowNum=sheet.getLastRowNum();
		for(int i=1;i<=lastRowNum;i++)
		{
			for(int j=0;j<sheet.getRow(i).getLastCellNum();j++)
			{
				
				System.out.print(" "+sheet.getRow(i).getCell(j).getStringCellValue());
				WebDriver driver = Utility.getDriver();
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
				driver.manage().window().maximize();
				driver.get("https://demo.guru99.com/test/newtours/");
				
				driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(sheet.getRow(i).getCell(j).getStringCellValue());
				//driver.findElement(By.xpath("//input[@name='password']")).sendKeys(sheet.getRow(i).getCell(j).getStringCellValue());;
				//driver.findElement(By.xpath("//input[@name='submit']"));
				driver.quit();
			}
			System.out.println();
		}
		}
	}


