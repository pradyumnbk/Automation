package qsp;
import practice.FileLib;
import java.io.IOException;

public class GenericLib 
{

	public static void main(String[] args) throws IOException 
	{
		FileLib f=new FileLib();
		System.out.println(f.getPropertyValue("url"));
		System.out.println(f.getPropertyValue("un"));
		System.out.println(f.getPropertyValue("pwd"));
		f.setExcelValue("createcustomer", 1, 4, "no data");
		System.out.println(f.getExcelValue("createcustomer", 1, 3));

	}

}
