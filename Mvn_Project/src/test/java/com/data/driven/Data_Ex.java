package com.data.driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Ex {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\dell\\Desktop\\login.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);//UpCasting
		Sheet sh = wb.getSheetAt(0);
		Row row = sh.getRow(2);
		Cell cell = row.getCell(0);
		CellType ct = cell.getCellType();
		if (ct.equals(CellType.STRING)) {
			String v = cell.getStringCellValue();
			System.out.println(v);
			
		}
		else if (ct.equals(CellType.NUMERIC)) {
			double d = cell.getNumericCellValue();
			int i = (int) d;
			String v = String.valueOf(i);
			System.out.println(v);
		}
	}
}
