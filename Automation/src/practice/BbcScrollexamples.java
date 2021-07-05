package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbcScrollexamples 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/news");
		driver.manage().window().maximize();
		int y= driver.findElement(By.xpath("(//a[contains(@class,'gs-c-promo-heading ')])[70]")).getLocation().getY();
		JavascriptExecutor r= (JavascriptExecutor) driver;
		driver.navigate().refresh();
		r.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		r.executeScript("window.scrollTo(0,0)");
		//driver.close();
	}

}
