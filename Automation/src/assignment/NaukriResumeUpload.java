package assignment;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukriResumeUpload 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		String pwh = driver.getWindowHandle();
		 Set<String> cwh = driver.getWindowHandles();
		 for (String wh : cwh) 
		 {
			 driver.switchTo().window(wh);
			 if(!(pwh.contentEquals(wh)))
			 {
				 driver.close();
			 }
		 }
		 driver.switchTo().window(pwh);
			 driver.findElement(By.id("block")).click();
			 driver.findElement(By.xpath("//div[text()='Login']")).click();
			 driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("barik.pradyumn0@gmail.com");
			 driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Barik@123");
			 driver.findElement(By.xpath("//button[text()='Login']")).click();
			 WebElement e = driver.findElement(By.linkText("ADD DETAILS"));
			 Actions a=new Actions(driver);
			 a.moveToElement(e).click().perform();
			 driver.navigate().refresh();
			 File f=new File("./data/resume.pdf");
			 String absolutepath = f.getAbsolutePath();
			 driver.navigate().refresh();
			 driver.findElement(By.id("attachCV")).sendKeys(absolutepath);
			
	}

}
