package assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class MultipleDataExcelNestedLoop 
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheet("Invalid-Login").getLastRowNum();
		short cellcount = wb.getSheet("Invalid-Login").getRow(0).getLastCellNum();
		for (int j=0;j<cellcount;j++)
		{
			for (int i = 1; i <=rowcount; i++) 
			{
				String value = wb.getSheet("Invalid-Login").getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
			}
		}
	}

}

