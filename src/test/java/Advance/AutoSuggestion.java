package Advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("bluetooth");
		Thread.sleep(2000);
		List<WebElement> allLinks = driver.findElements(By.tagName("li"));
		
	for(WebElement wb:allLinks)
	{
		// 1//2//3//4
		System.out.println(wb.getText());
		//if(wb.getText().contains(" headset boat"))
			if(wb.getText().contains(" headphones"))
		{
			wb.click();
			break;
		}
	}
	}

}
