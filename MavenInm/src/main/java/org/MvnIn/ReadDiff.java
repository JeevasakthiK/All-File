package org.MvnIn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDiff {

	public static void main(String[] args) throws IOException {
		// mention excel sheet path
		File f = new File("C:\\Users\\dell\\eclipse-workspace\\MavenInm\\Excel\\Mvn Data.xlsx");

		// to read the file
		FileInputStream fis = new FileInputStream(f);

		// to read.xlsx file format
		Workbook wb = new XSSFWorkbook(fis);

		// get sheet from workbook
		Sheet mysheet = wb.getSheet("Sample");

		for (int i = 0; i < mysheet.getPhysicalNumberOfRows(); i++) {
			Row itRow = mysheet.getRow(i);
			for (int j = 0; j < itRow.getPhysicalNumberOfCells(); j++) {
				Cell itCell = itRow.getCell(j);
				System.out.println(itCell);

			}

		}

	}

}
