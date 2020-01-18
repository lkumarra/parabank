package com.parabank.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import com.parabank.qa.base.TestBase;

public class TestUtils extends TestBase {

	public static String EXCEL_SHEET_PATH = "C:\\selenium\\Pom\\PageObjectModel-master\\qa.parabank.com\\src\\main\\java\\com\\parabank\\qa\\testdata\\ParaBankRegistration.xlsx";
	
	static Workbook book;
	static Sheet sheet;
	
	public static Object [][] getData(String sheetName){
		FileInputStream file = null;
		try {
			file = new FileInputStream(EXCEL_SHEET_PATH);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			book=WorkbookFactory.create(file);
		}catch(InvalidFormatException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object [][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i = 0; i<sheet.getLastRowNum(); i++) {
			for(int k = 0; k<(sheet.getRow(0).getLastCellNum()); k++) {
				data [i][k] = sheet.getRow(i+1).getCell(k).toString();
			}
		}
		return data;
	}
			
}
