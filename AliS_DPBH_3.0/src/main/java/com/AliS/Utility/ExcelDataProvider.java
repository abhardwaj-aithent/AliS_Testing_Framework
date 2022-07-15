package com.AliS.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

XSSFWorkbook wb;
	
XSSFSheet sheet1;
	 public ExcelDataProvider() throws Exception {
		File src = new File("./TestDataFiles/LoginAlis.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			 wb = new XSSFWorkbook(fis);
			sheet1 = wb.getSheetAt(0);
			
		int rowcount=sheet1.getLastRowNum();
		System.out.println("Total no of rows is:" +rowcount);
		
		
		for(int i = 0 ;i<rowcount;i++) {
			String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			
		}
		 	//FileOutputStream fout= new FileOutputStream(src);
			//wb.write(fout);
			
		} catch (Exception e) {
			System.out.println("Unable to Read Excel File" + e.getMessage());
		}
	
		
	}
	
	public String getStringData(int sheetIndex, int row , int column) 
	{
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	
	
	public String getStringData(String sheetName , int row , int column) 
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public double getNumericData(String sheetName , int row , int column) 
	{
		return  wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}
	
	
	
	
	
	
}

	
	

