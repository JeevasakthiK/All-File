package org.MvnIn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {

		// mention excel sheet path
		File f = new File("C:\\Users\\dell\\eclipse-workspace\\MavenInm\\Excel\\Mvn Data.xlsx");

		// to read the file
		FileInputStream fil = new FileInputStream(f);

		// to read.xlsx file format
		Workbook wb = new XSSFWorkbook(fil);

		// get sheet from workbook
		Sheet mysheet = wb.getSheet("Sample");

		// Get row from sheet
		Row pertRow = mysheet.getRow(1);

		// get cell from row
		Cell pertCell = pertRow.getCell(0);
		System.out.println(pertCell);

	}

}
