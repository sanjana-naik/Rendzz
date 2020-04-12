package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericDataprovider implements Auto_const
{
	public static Object[][] getData(String sheet)
	{
		Object[][] data=null;
		try
		{
			FileInputStream fis=new FileInputStream(excel_path);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheet);
			int rc = sh.getLastRowNum();//3
			Row r = sh.getRow(0);
			short cc = r.getLastCellNum();//2
			data=new Object[rc+1][cc];//4*2 matrix size
			for(int i=0;i<rc+1;i++)
			{
				Row row = sh.getRow(i);
				for(int j=0;j<cc;j++)
				{
					Cell cell = row.getCell(j);
					String value = cell.getStringCellValue();
					data[i][j]=value;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Invalid path");
		}
		return data;
	}
}
