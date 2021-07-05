package assignment;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriUpload 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
		driver.findElement(By.id("usernameField")).sendKeys("barik.pradyumn0@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Barik@123");
		driver.findElement(By.xpath("//button[.='Login']")).click();
		driver.findElement(By.xpath("(//div[.='UPDATE PROFILE'])[2]")).click();
		File f=new File("./data/resume.pdf");
		String absolutepath = f.getAbsolutePath();
		Thread.sleep(5000);
		driver.findElement(By.id("attachCV")).sendKeys(absolutepath);
	}

}
