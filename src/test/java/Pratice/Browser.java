package Pratice;



import java.io.FileNotFoundException;

import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.j2objc.annotations.Property;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.Java_Utility;

import Generic_Utility.Property_Utility;
import Generic_Utility.WEbdriver_Utility;
import Object_Repo.Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Generic_Utility.ListenerImp.class)
public class Browser extends BaseClass{

	
	@Test(groups = "smokeTest")	
		public void Browser() throws Throwable
		{
		
		Property_Utility prolib=new Property_Utility();
	    WEbdriver_Utility wlib=new WEbdriver_Utility();
		wlib.implicity_wait(driver);
Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		
         Assert.assertEquals(true, false);
		
		Java_Utility jlib=new Java_Utility();
		int ranNUm = jlib.getRanDomNum();
		
		/*Random ran=new Random();
		int ranNum = ran.nextInt(1000);*/
	Thread.sleep(1000);
		Excel_Utility elib=new Excel_Utility();
	
		String exceldata = elib.getExcelDataByFormatter("Sheet1", 1, 0)+ranNUm;
		
		driver.findElement(By.id("name")).sendKeys(exceldata);
		
	//	driver.findElement(By.xpath("//input[@value='   Create Type of Work   ']")).click();
	//	driver.findElement(By.xpath("//input[@onclick='handleCancel();']")).click();
		
		//wlib.getAlertAccept(driver);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
	


}
