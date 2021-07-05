package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib 
{
	/**
	 * generic method to read the data from property file
	 * @param key
	 * @return String
	 * @throws IOException 
	 */
	public String getPropertyValue(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p= new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	/**
	 * generic method to read the data from excel
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return String
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	public String getExcelData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	/**
	 * generic method to write the data to the excel sheet
	 * @param sheet
	 * @param row
	 * @param cell
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	public void setExcelData(String sheet,int row,int cell,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		wb.write(fos);
		wb.close();
	}


}
