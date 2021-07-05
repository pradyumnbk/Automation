package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException  
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
			driver.navigate().refresh();
			driver.findElement(By.xpath("(//div[contains(@class,'makeFlex column ')])[3]")).click();
		
			driver.findElement(By.id("fromCity")).click();
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Bangalore");
			driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]")).click();

			driver.findElement(By.id("toCity")).click();
			driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Goa");
			driver.findElement(By.xpath("//p[contains(text(),'Goa')]")).click();
			driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();
			driver.findElement(By.xpath("(//p[.='18'])[1]")).click();
			driver.findElement(By.xpath("//a[.='Search']")).click();
	List<WebElement> allFlights = driver.findElements(By.xpath("//span[@class='boldFont blackText airlineName']"));		List<WebElement> allFlightsDepTime = driver.findElements(By.xpath("//p[.='Bengaluru']/../p[1]/span"));
			for(int i=0;i<allFlights.size();i++) {
				String flightName = allFlights.get(i).getText();
				String depTime = allFlightsDepTime.get(i).getText();
				System.out.println(flightName+"----->"+depTime);
			}
			driver.close();
		}

	}