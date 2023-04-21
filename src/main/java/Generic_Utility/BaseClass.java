package Generic_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Object_Repo.Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public static WebDriver sdriver;
	@BeforeSuite(groups = {"smokeTest","RegressionTest"})
	public void BS()
	{
		System.out.println("DataBase Open");
	}
	
	@BeforeTest(groups = {"smokeTest","RegressionTest"})
	public void BT()
	{
		System.out.println("Parallel Execution");
	}
	
	//@Parameters("BROWSER")
	@BeforeClass(groups = {"smokeTest","RegressionTest"})
	public void BC() throws Throwable
	{
		Property_Utility prolib=new Property_Utility();
	
		String BROWSER = prolib.getKeyValue("browser");
	
	//public void BC(String BROWSER) throws Throwable {
		
		//WebDriver driver;
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
			
		}
		System.out.println("Launching Browser");
		sdriver=driver;
	}
	
	@BeforeMethod(groups = {"smokeTest","RegressionTest"})
	public void BM() throws Throwable
	{
		Property_Utility prolib=new Property_Utility();
		 String URL = prolib.getKeyValue("url");
	      String USERNAME = prolib.getKeyValue("username");
	       String PASSWORD = prolib.getKeyValue("password");

			driver.get(URL);
			Login_Page login=new Login_Page(driver);
			login.loginData(USERNAME, PASSWORD);
		System.out.println("Login Application");
	}
	

@AfterMethod(groups = {"smokeTest","RegressionTest"})
	public void AM()
	{
		System.out.println("Logout Application");
	}

@AfterClass(groups = {"smokeTest","RegressionTest"})
public void AC()
{
	System.out.println("close Browser");
}
@AfterTest(groups = {"smokeTest","RegressionTest"})
public void AT()
{
	System.out.println("Parallel Execution done");
}

@AfterSuite(groups = {"smokeTest","RegressionTest"})
public void AS()
{
	System.out.println("DataBase close");
}
}
