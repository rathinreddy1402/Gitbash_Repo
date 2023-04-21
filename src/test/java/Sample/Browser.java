package Sample;



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
import org.testng.annotations.Test;

import com.google.j2objc.annotations.Property;

import Generic_Utility.BaseClass;
import Generic_Utility.Excel_Utility;
import Generic_Utility.Java_Utility;

import Generic_Utility.Property_Utility;
import Generic_Utility.WEbdriver_Utility;
import Object_Repo.Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Browser extends BaseClass{

	

	@Test(groups = "RegressionTest")	
		public void Browser() throws Throwable
		{
		//type1(Browser Launching)
		//WebDriver driver=new ChromeDriver();
	
		//type2(Browser Launching)
   /*String key="webdriver.chrome.driver";
   //String Value="C:\\Users\\Shobha\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe";
   String Value="./src/main/resources/chromedriver.exe";
   System.setProperty(key, Value);
   WebDriver driver=new ChromeDriver();*/
		
		//type3(Browser Launching)
		Property_Utility prolib=new Property_Utility();
	/*	String BROWSER = prolib.getKeyValue("browser");
		
		WebDriver driver;
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else 
		{
			driver=new ChromeDriver();
		}*/
		
		WEbdriver_Utility wlib=new WEbdriver_Utility();
		
		wlib.implicity_wait(driver);
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

/*driver.get("https://demo.actitime.com/login.do");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("loginButton")).click();*/
		//path
	/*	FileInputStream fis =new FileInputStream("./src/test/resources/commondataCanada.properties.txt");
		Properties pro =new Properties();
		pro.load(fis);
        String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");*/

    /*  String URL = prolib.getKeyValue("url");
      String USERNAME = prolib.getKeyValue("username");
       String PASSWORD = prolib.getKeyValue("password");

		driver.get(URL);
		Login_Page login=new Login_Page(driver);
		login.loginData(USERNAME, PASSWORD);*/
		
	/*	driver.findElement(By.id("username")).sendKeys(USERNAME);
		driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
		driver.findElement(By.id("loginButton")).click();*/
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		
		Java_Utility jlib=new Java_Utility();
		int ranNUm = jlib.getRanDomNum();
		
		/*Random ran=new Random();
		int ranNum = ran.nextInt(1000);*/
		
		Thread.sleep(1000);
		Excel_Utility elib=new Excel_Utility();
	
		String exceldata = elib.getExcelDataByFormatter("Sheet1", 1, 0)+ranNUm;
		
		/*FileInputStream fie=new FileInputStream("C:\\Users\\Shobha\\Desktop\\CanadaBatch.xlsx");
	     Workbook book=WorkbookFactory.create(fie);
	     Sheet sheet = book.getSheet("Sheet1");
	     Row row = sheet.getRow(0);
		Cell cel = row.getCell(0);
		String exceldata = cel.getStringCellValue()+ranNUm;*/
		
		driver.findElement(By.id("name")).sendKeys(exceldata);
		
	//	driver.findElement(By.xpath("//input[@value='   Create Type of Work   ']")).click();
		driver.findElement(By.xpath("//input[@onclick='handleCancel();']")).click();
		
		wlib.getAlertAccept(driver);
		//Alert alt = driver.switchTo().alert();
		//alt.accept();
		//alt.dismiss();
	}

}
