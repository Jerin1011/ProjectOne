package org.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadAndWrite {
	int rowcount;
	int cellcount;
	XSSFSheet sheet;
	public void readExcel() throws Exception {
		//Take All Data From Excel
		FileInputStream fis = new FileInputStream("C:\\Users\\jerin\\Downloads\\First.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("Sheet1");
		rowcount = sheet.getLastRowNum();
		cellcount= sheet.getRow(0).getLastCellNum();
		for(int i=0; i<rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j<cellcount; j++) {
			String data = row.getCell(j).toString();
			System.out.print("   "+ data);	
			}
			System.out.println();
		}
	}

	public void specificRead() {
		System.out.println("Specific Read - II");
		XSSFRow row2 = sheet.getRow(1);
		XSSFCell cell = row2.getCell(3);
//		String stringCellValue = cell.getStringCellValue();
		String data = cell.toString();
		System.out.println("specific = " + data);

//		System.out.println("Specific Read");
//		int rowno = 0;
//		int cellno = 0;
//		String value = "Name";
//	for(int i=0; i<=rowcount; i++) {
//		XSSFRow row = sheet.getRow(i);
//		XSSFCell cell = row.getCell(0);
//		System.out.println(cell);	
//		}		
//
//	XSSFRow row = sheet.getRow(0);
//	for(int j=0; j<cellcount; j++) {
//		XSSFCell cell = row.getCell(j);
//		String value2 = cell.getStringCellValue();
//		System.out.println(value2);
//	}
}
	
	
	public static void main(String[] args) throws Exception {
		ExcelReadAndWrite read = new ExcelReadAndWrite ();
		read.readExcel();
	read.specificRead();
	
	
	
	}

}
