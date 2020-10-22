package com.commonutils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		XSSFWorkbook workbook=null;
		try {
			workbook = new XSSFWorkbook("D:\\API testing\\automation\\Testdata\\Testdata.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
		int rowcount=sheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);
		
		int columncount=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(columncount);
		
		String data=sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data);


	}

}
