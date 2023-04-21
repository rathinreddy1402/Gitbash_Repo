package Advance;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingRobot {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();

	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_PAGE_UP);
	r.keyRelease(KeyEvent.VK_PAGE_UP);
	
	Thread.sleep(1000);	
	r.keyPress(KeyEvent.VK_PAGE_UP);
	r.keyRelease(KeyEvent.VK_PAGE_UP);
	
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_PAGE_UP);
	r.keyRelease(KeyEvent.VK_PAGE_UP);
	
	}

	}


