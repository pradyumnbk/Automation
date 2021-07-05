package assignment;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTab 
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
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager"+Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		driver.findElement(By.linkText("Read Service Agreement")).click();
		String ptab = driver.getWindowHandle();
		Set<String> ctab = driver.getWindowHandles();
		for (String tabs : ctab) 
		{
			driver.switchTo().window(tabs);
			if (!(tabs.equals(ptab)))
			{
				driver.switchTo().window(tabs);
				 List<WebElement> alllink = driver.findElements(By.xpath("//u"));
				 for ( WebElement link : alllink) 
				 {
					System.out.println(link.getText());
				}
				 Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(ptab);
		Thread.sleep(3000);
		driver.close();
	}

}
