package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertingMultipleDataFromExcel 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.out.println("enter the title name");
		Scanner sc=new Scanner(System.in);
		String expectedtitle = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheet("Invalid-Login").getLastRowNum();
		int cellcount=wb.getSheet("Invalid-Login").getRow(0).getLastCellNum();
		for (int i = 1; i <=rowcount; i++) 
		{
			for (int j=0;j<cellcount;j++)
			{
				String username = wb.getSheet("Invalid-Login").getRow(i).getCell(j).getStringCellValue();
				driver.findElement(By.id("username")).sendKeys(username);
			
	                try
	                {
					String password = wb.getSheet("Invalid-Login").getRow(i).getCell(j+1).getStringCellValue();
					driver.findElement(By.name("pwd")).sendKeys(password);
	                }
	                catch (NullPointerException e)
	                {
	                	break;
	                }
					driver.findElement(By.xpath("//div[text()='Login ']")).click();
				
					String actualtitle = driver.getTitle();
					if (actualtitle.equals(expectedtitle))
					{
						System.out.println("test case passed");
						wb.getSheet("Invalid-Login").getRow(1).getCell(2).setCellValue("pass");
					}
					else
					{
						System.out.println("test case failed");
						wb.getSheet("Invalid-Login").getRow(1).getCell(2).setCellValue("fail");
					}
					
			}
			
		}
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		wb.write(fos);
		wb.close();
		
		driver.close();
	}
	

}