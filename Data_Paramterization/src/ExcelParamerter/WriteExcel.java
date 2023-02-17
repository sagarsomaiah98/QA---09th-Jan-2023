package ExcelParamerter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Workbook wb = new XSSFWorkbook();
		
		try (OutputStream fileOut = new FileOutputStream("S:\\JANBASK\\QA - 09th Jan 2023\\Data_Paramterization\\src\\TestData\\Test.xlsx")) {
			Sheet S1 = wb.createSheet("SHEET A");
			Sheet S2 = wb.createSheet("SHEET B");
			
		
			  Row R1 = S1.createRow(0);
			  Row R2= S1.createRow(1);
			  Row R3=S1.createRow(2);
			  Row R4=S1.createRow(3);
			  Row R5=S1.createRow(4);
			  //Cell cell = R1.createCell(8);
			 //cell.setCellValue(512);
			 
			
			R1.createCell(2).setCellValue(1.2);
			R1.createCell(3).setCellValue("Peter");
			R1.createCell(4).setCellValue(true);
			
			R2.createCell(2).setCellValue(4.2);
			R2.createCell(3).setCellValue("James");
			R2.createCell(4).setCellValue(false);
			
			R3.createCell(2).setCellValue(35.8);
			R3.createCell(3).setCellValue("Joe");
			R3.createCell(4).setCellValue(true);
			
			R4.createCell(2).setCellValue(14.12);
			R4.createCell(3).setCellValue("Bob");
			R4.createCell(4).setCellValue(true);
			
			R5.createCell(2).setCellValue(5.20);
			R5.createCell(3).setCellValue("Jack");
			R5.createCell(4).setCellValue(true);
			
			
		    wb.write(fileOut);
		    System.out.println("done");
		}

	}

}
