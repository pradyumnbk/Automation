package com.actitime.testscript;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.actitime.pomrepository.LoginPage;

public class MainRunnerCls 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static String expectedtitle;
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.out.println("Enter the title name");
		Scanner sc=new Scanner(System.in);
		expectedtitle = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheet("Invalid-Login").getLastRowNum();
		//int cellcount=wb.getSheet("Invalid-Login").getRow(0).getLastCellNum();
		LoginPage l=new LoginPage();
		PageFactory.initElements(driver, l);
		for (int i = 1; i <=rowcount; i++) 
		{
			
			//for (int j=0;j<cellcount;j++)
			//{
				String username = wb.getSheet("Invalid-Login").getRow(i).getCell(0).getStringCellValue();
				l.setUsername(username);
			
	        
					String password = wb.getSheet("Invalid-Login").getRow(i).getCell(1).getStringCellValue();
					l.setPassword(password);
	               
	      
	                l.setLogin();
	                String actualtitle = driver.getTitle();
					if (actualtitle.equals(expectedtitle))
					{
						System.out.println("test case passed");
						wb.getSheet("Invalid-Login").getRow(i).getCell(2).setCellValue("pass");
					}
					else
					{
						System.out.println("test case failed");
						wb.getSheet("Invalid-Login").getRow(i).getCell(2).setCellValue("fail");
					}
					

	
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		wb.write(fos);
		//fos.flush();
		
Thread.sleep(3000);
			}
		wb.close();
		driver.close();
	}
}

		
		



