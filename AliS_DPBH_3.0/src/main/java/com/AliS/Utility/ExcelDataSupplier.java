package com.AliS.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupplier {
	
	@DataProvider (name="Logindata")
	public String[][] GetData() throws Exception
	 {
File src= new File("./TestDataFiles/LoginAlis.xlsx") ;
FileInputStream fis= new FileInputStream(src);
XSSFWorkbook wb= new XSSFWorkbook(fis);
XSSFSheet sheet= wb.getSheetAt(0);
int noofRows=sheet.getPhysicalNumberOfRows();
int noofColumns=sheet.getRow(0).getLastCellNum();


String[][] data =new String[noofRows-1][noofColumns];
for(int i=1; i < noofRows-1; i++) {
	for(int j=0; j < noofColumns; j++) {
	DataFormatter df= new DataFormatter();
	data[i][j]= df.formatCellValue(sheet.getRow(i+1).getCell(j));
	
	
	}
}
wb.close();
fis.close();

return data;
	 }


	 
}
