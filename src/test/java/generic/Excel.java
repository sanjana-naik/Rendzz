package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements Auto_const 
{
	public static String getData(String sheet,int row,int cell)
	{
		String val="";
		try
		{
			FileInputStream fis=new FileInputStream(excel_path);
			Workbook wb = WorkbookFactory.create(fis);
			Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
			val = c.getStringCellValue();
		}
		catch(Exception e)
		{
			System.out.println("fail to read data");
		}
		return val;
	}
	
	public static void writeData(String sheet, int row, int cell, String val)
	{
		try
		{
			FileInputStream fis=new FileInputStream(excel_path);
			Workbook wb = WorkbookFactory.create(fis);
			Cell c = wb.getSheet(sheet).getRow(row).createCell(cell);
			c.setCellValue(val);
			FileOutputStream fout=new FileOutputStream(excel_path);
			wb.write(fout);
		}
		catch(Exception e)
		{
			System.out.println("fail to write data");
		}
	}
}

