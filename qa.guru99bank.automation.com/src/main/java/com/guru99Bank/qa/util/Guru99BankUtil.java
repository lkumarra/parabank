package com.guru99Bank.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.guru99Bank.qa.base.Guru99TestBase;

public class Guru99BankUtil extends Guru99TestBase{
	public static String EXCEL_SHEET_PATH = "C:\\Users\\Lavendra rajput\\git\\parabank\\qa.guru99bank.automation.com\\src\\main\\java\\com\\guru99Bank\\qa\\testdata\\Guru99Bank.xlsx";
	static Workbook book;
	static Sheet sheet;
	static  FileInputStream file;
	
	public static Object [][] getData(String sheetName){
		FileInputStream file = null;
		try {
			file = new FileInputStream(EXCEL_SHEET_PATH);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			book = WorkbookFactory.create(file);
		}catch(InvalidFormatException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object [][] data = new Object [sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i = 0;i<sheet.getLastRowNum();i++) {
			for(int k = 0;k<sheet.getRow(0).getLastCellNum();k++) {
				data[i][k] = sheet.getRow(i+1).getCell(k).toString();
			}
		}
		return data;
	}

}
