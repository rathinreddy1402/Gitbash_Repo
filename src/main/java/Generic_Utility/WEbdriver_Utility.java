package Generic_Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class WEbdriver_Utility {

	public void implicity_wait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void getAlertAccept(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();

	}
	
	public void getAlertDismiss(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.dismiss();

	}
}
