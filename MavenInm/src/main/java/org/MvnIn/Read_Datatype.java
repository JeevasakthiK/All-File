package org.MvnIn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Datatype {

	public static void main(String[] args) throws IOException {
		// mention excel sheet path
		File f = new File("C:\\Users\\dell\\eclipse-workspace\\MavenInm\\Excel\\Mvn Data.xlsx");
		// to read the file
		FileInputStream fil = new FileInputStream(f);
		// to read.xlsx file format
		Workbook wb = new XSSFWorkbook(fil);
		Sheet mySheet = wb.getSheet("Datatype");
		for (int i = 0; i < mySheet.getPhysicalNumberOfRows(); i++) {
			Row row = mySheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell c = row.getCell(j);
				int cType = c.getCellType();
				// cell type =1 string cell default
				// cell type = other than 1 is dateCell / numeric cell
				if (cType == 1) {
					String value = c.getStringCellValue();
					System.out.println(value);

				} else if (DateUtil.isCellDateFormatted(c)) {
					Date dd = c.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("dd-MMM-yy");
					String value = s.format(dd);
					System.out.println(value);
				} else {
					double d = c.getNumericCellValue();
					long l = (long) d;
					String value = String.valueOf(l);
					System.out.println(value);
				}
				;
			}

		}

	}

}
