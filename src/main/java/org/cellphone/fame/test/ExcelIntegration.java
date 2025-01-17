package org.cellphone.fame.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntegration {
	
	public static String getData(int row, int cell) throws IOException
	{
	File loc = new File("E:\\JavaSelenium\\DineshGanesan\\CellPhoneFame\\TestData\\CellPhone.xlsx");

	FileInputStream stream = new FileInputStream(loc);

	Workbook w = new XSSFWorkbook(stream);

	Sheet s = w.getSheet("Sheet1");

	Row r = s.getRow(row);

	Cell c = r.getCell(cell);

	System.out.println(c);

	String value = null;

	int cellType = c.getCellType();
	//System.out.println(cellType);

	if(cellType==1)
	{

	value = c.getStringCellValue();
	//System.out.println(value);

	}

	else if(cellType==0)
	{
	if(DateUtil.isCellDateFormatted(c))
	{

	Date d = c.getDateCellValue();
	System.out.println(d);
	SimpleDateFormat sd = new SimpleDateFormat("MM-dd-yyyy");
	value = sd.format(d);
	//System.out.println(value);

	}

	else
	{

	double numericValue = c.getNumericCellValue();
	long l = (long) numericValue;
	value = String.valueOf(l);
	//System.out.println(value);

	}

	}

	return value;

	}

}
