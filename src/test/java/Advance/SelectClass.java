package Advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement daylist = driver.findElement(By.id("day"));
		//selectbyindex
		Select sel=new Select(daylist);
		sel.selectByIndex(10);
		
		WebElement monthlist = driver.findElement(By.id("month"));
		//selectbyvalue
		Select sel1=new Select(monthlist);
		sel1.selectByValue("2");
		
		WebElement yearlist = driver.findElement(By.id("year"));
		//selectbyvisibletext
		Select sel2=new Select(yearlist);
		sel2.selectByVisibleText("2012");
		
	}

}
