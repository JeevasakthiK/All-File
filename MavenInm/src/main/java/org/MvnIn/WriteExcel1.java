package org.MvnIn;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel1 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\dell\\eclipse-workspace\\MavenInm\\Excel\\Challenge.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet newSheet = w.createSheet("Course");

		Row newRow = newSheet.createRow(0);
		Cell newCell = newRow.createCell(0);
		newCell.setCellValue("Selenium");
		Cell newCell1 = newRow.createCell(1);
		newCell1.setCellValue("Appium");

		Row newRow1 = newSheet.createRow(1);
		Cell newCell2 = newRow1.createCell(0);
		newCell2.setCellValue("Java");
		Cell newCell3 = newRow1.createCell(1);
		newCell3.setCellValue("Cucumber");

		Row newRow2 = newSheet.createRow(2);
		Cell newCell4 = newRow2.createCell(0);
		newCell4.setCellValue("Data Driven");
		Cell newCell5 = newRow2.createCell(1);
		newCell5.setCellValue("Junit");

		Row newRow3 = newSheet.createRow(3);
		Cell newCell6 = newRow3.createCell(0);
		newCell6.setCellValue("POM");
		Cell newCell7 = newRow3.createCell(1);
		newCell7.setCellValue("TestNG");

		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);

	}

}
