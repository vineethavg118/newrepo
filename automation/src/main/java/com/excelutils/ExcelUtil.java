package com.excelutils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	static XSSFWorkbook workbook=null;
	static XSSFSheet sheet=null;

	public static void getSheet() {
		try {
			workbook=new XSSFWorkbook("D:\\API downloads\\LoginTestdata.xlsx");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
		sheet=workbook.getSheet("Sheet1");

	}

	public static int getRowCount() {
		ExcelUtil.getSheet();
		System.out.println(sheet);
		int rowcount=sheet.getPhysicalNumberOfRows(); 
		return rowcount;
	}

	public static int getColumnCount() {
		ExcelUtil.getSheet();
		int columnCount=sheet.getRow(0).getPhysicalNumberOfCells();  
		return columnCount;
	} 

	public static String getStringData(int row, int coulmn) {
		ExcelUtil.getSheet();
		String data= sheet.getRow(row).getCell(coulmn).getStringCellValue();
		return data;  
	}
	
	
	public static long getNumData(int row, int column) {
		
		ExcelUtil.getSheet();
		long data= (long) sheet.getRow(row).getCell(column).getNumericCellValue();
		return data;  
	}
	public static String getDateData(int row, int column) {

		ExcelUtil.getSheet();
		String data=  new SimpleDateFormat("dd-MM-yyyy").format(sheet.getRow(row).getCell(column).getDateCellValue());
		return data;  
	}
	

}

