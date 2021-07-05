package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaukriDownloadPopup 
{
	static
	{
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		 
			 driver.findElement(By.id("block")).click();
			 driver.findElement(By.xpath("//div[text()='Login']")).click();
			 driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("barik.pradyumn0@gmail.com");
			 driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Barik@123");
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//button[text()='Login']")).click();
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
			 driver.findElement(By.xpath("(//i[text()='Download'])[1]")).click();
			 Thread.sleep(3000);
			 Robot r=new Robot();
			 r.keyPress(KeyEvent.VK_ALT);
			 r.keyPress(KeyEvent.VK_S);
			 r.keyRelease(KeyEvent.VK_ALT);
			 r.keyPress(KeyEvent.VK_ENTER);
			 r.keyRelease(KeyEvent.VK_ENTER);
	}

}
