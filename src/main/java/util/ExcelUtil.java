package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	XSSFWorkbook xssfworkbook;
	FileInputStream fis;
	XSSFSheet sheet;
	
	public ExcelUtil(String path, String sheetname) throws IOException
	{
		
		fis = new FileInputStream(new File(path));
		xssfworkbook = new XSSFWorkbook(fis);
		sheet = xssfworkbook.getSheet(sheetname);
		
	}
	
	public int numberOfRowsInExcel()
	{
		
		return sheet.getPhysicalNumberOfRows();
	}
	

}
