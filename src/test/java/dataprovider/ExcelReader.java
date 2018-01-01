package dataprovider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	XSSFWorkbook wb;
	
	public ExcelReader()
	{
		
		File src=new File("./ApplicationTestData/AppData.xlsx");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			 wb=new XSSFWorkbook(fis);
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("exception is"+e.getMessage());
		}
	}

	public String getData(int Sheetindex,int row,int col)
	{
		String data=wb.getSheetAt(Sheetindex).getRow(row).getCell(col).getStringCellValue();
		
		return data;
	}
	
	public String getData(String Sheetname,int row,int col)  //above methods is ok if we have limited sheets but when there are multiple sheets need to use sheetname
	{
		String data=wb.getSheet(Sheetname).getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	
	
}
