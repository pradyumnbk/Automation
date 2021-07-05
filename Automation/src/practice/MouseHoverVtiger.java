package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverVtiger 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		WebElement resourcetab = driver.findElement(By.id("navbarDocumentation"));
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		a.moveToElement(resourcetab).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		Thread.sleep(3000);
		String phoneno = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]/../p[2]")).getText();
		System.out.println(phoneno);
		Thread.sleep(3000);
		driver.close();
	}

}
