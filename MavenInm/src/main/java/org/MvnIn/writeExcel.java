package org.MvnIn;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel {

	public static void main(String[] args) throws IOException {
		 File f = new File("C:\\Users\\dell\\eclipse-workspace\\MavenInm\\Excel\\newExcel.xlsx");
		 Workbook w = new  XSSFWorkbook();
		 Sheet newSheet = w.createSheet("course");
		 Row newRow = newSheet.createRow(0);
		 Cell newCell = newRow.createCell(0);
		 newCell.setCellValue("Selenium");
		 FileOutputStream fos = new FileOutputStream(f);
		 w.write(fos);
	
	}

}
