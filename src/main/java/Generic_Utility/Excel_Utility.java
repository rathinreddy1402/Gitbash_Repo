package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {

	public String getExcelData(String sheet,int rowNum,int cellNum) throws Throwable
	{
		FileInputStream fie=new FileInputStream("./src/test/resources/CanadaBatch.xlsx");
	     Workbook book=WorkbookFactory.create(fie);
          Sheet sh = book.getSheet(sheet);
          Row row = sh.getRow(rowNum);
		Cell cel = row.getCell(cellNum);
		String exceldata = cel.getStringCellValue();
		return exceldata;
	     
	     
	  /*   DataFormatter format=new DataFormatter();
	     String data = format.formatCellValue(book.getSheet(sheet).getRow(rowNum).getCell(cellNum));
	     return data;*/
	    }
	public String getExcelDataByFormatter(String sheet,int rowNum,int cellNum) throws Throwable
	{
		FileInputStream fie=new FileInputStream("./src/test/resources/CanadaBatch.xlsx");
	     Workbook book=WorkbookFactory.create(fie);
	     
	     DataFormatter format=new DataFormatter();
	     String data = format.formatCellValue(book.getSheet(sheet).getRow(rowNum).getCell(cellNum));
	     return data;
	}
	
}
