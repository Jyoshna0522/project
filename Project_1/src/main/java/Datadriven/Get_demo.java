package Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Get_demo {
	public static void main(String[] args) throws Throwable {
		toReadParticularData();
		
		// To write Data
		
		File sj = new File("C:\\Users\\Admin\\eclipse-workspace\\selenium\\Project_1\\src\\main\\java\\School.xlsx");
		FileInputStream abc = new FileInputStream(sj);
		// workbook W= new XSSFworkbook();
		Workbook W = new XSSFWorkbook();
		XSSFSheet sheet = (XSSFSheet) W.createSheet("Maths department");
		XSSFRow createRow = sheet.createRow(0);
		XSSFRow createRow1 = sheet.createRow(1);
		XSSFCell createCell = createRow.createCell(0);
		createCell.setCellValue("Student data");
		sheet.getRow(0).createCell(1).setCellValue("Grade 1");
		sheet.getRow(0).createCell(2).setCellValue("Grade 2");
		sheet.getRow(0).createCell(3).setCellValue("Grade 3");
		sheet.getRow(0).createCell(4).setCellValue("Grade 4");
		sheet.getRow(1).createCell(1).setCellValue("Topper");
		sheet.getRow(1).createCell(2).setCellValue("Average");
		sheet.getRow(1).createCell(3).setCellValue("Below Average");
		sheet.getRow(1).createCell(4).setCellValue("Poor");
		FileOutputStream ss = new FileOutputStream(sj);
		W.write(ss);
	}
	       //ToReadParticular Data
	
//public static void main(String[] args) {
	
 public static void toReadParticularData() throws Throwable {
	 File sj = new File("C:\\Users\\Admin\\eclipse-workspace\\selenium\\Project_1\\src\\main\\java\\School.xlsx");
	 FileInputStream cdf = new FileInputStream(sj);
	 Workbook W = new XSSFWorkbook(cdf);
	 Cell cell = W.getSheetAt(0).getRow(1).getCell(1);
	 CellType celltype = cell.getCellType();
	 if (celltype.equals(celltype.STRING)) {
		 String stringcellvalue = cell.getStringCellValue();
		 System.out.println(stringcellvalue);
	 }
	 else if (celltype.equals(celltype.NUMERIC)) {
		 double Numericcellvalue = cell.getNumericCellValue();
		 System.out.println(Numericcellvalue);
			}
 }
      //ToReadAllData
 
//public static void main(String[] args) { 
//public static void toReadAllData() throws Throwable { 
	//File sj = new File("C:\\Users\\Admin\\eclipse-workspace\\selenium\\Project_1\\src\\main\\java\\School.xlsx");
	//FileInputStream fgh = new FileInputStream(sj);
	//Workbook W = new XSSFWorkbook(fgh);
    
    
	
	
}
	




