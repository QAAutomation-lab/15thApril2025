package day11.ddt;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelOperations {

	/**
	 * 1. Get sheet count 2. All sheet name 3. Add new sheet 4. Delete existing
	 * sheet
	 * 
	 * @throws IOException
	 */
	@Test(enabled = true)
	public void performOperationOnSheet() throws IOException {

		/* Identify the path and name of excel file */
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\testData\\AppData.xlsx");
		/* Create an instance of required workbook class */
		Workbook workbook = new XSSFWorkbook(fis);
		/* Perform required operation on sheet */
		/**
		 * 1. get sheet count
		 */
		int sheetCount = workbook.getNumberOfNames();
		System.out.println("Sheet count: " + sheetCount);
		/**
		 * 2. get sheet names
		 */
		for (int i = 0; i < sheetCount; i++) {
			System.out.println("Sheet name is : " + workbook.getSheetName(i));
		}
		/**
		 * 3. create new sheet
		 */
		workbook.createSheet("TestSheet_New");

		/**
		 * 4. Delete sheet
		 */
		workbook.removeSheetAt(3);

		/* Create an instance of FileOutputStream */
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\testData\\AppData.xlsx");
		/* write/store the content into required file */
		workbook.write(fos);
		/**/
		fos.flush();
		fos.close();
	}

	/**
	 * 1. get row count 2. create new row 3. delete row
	 */
	@Test(enabled = true)
	public void performRowOperations() throws IOException {
		/* Identify the path and name of excel file */
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\testData\\AppData.xlsx");
		/* Create an instance of required workbook class */
		Workbook workbook = new XSSFWorkbook(fis);
		/* get the sheet on which operation needs to be performed */
		Sheet sheet = workbook.getSheet("Sheet1");

		/* perform required operation on sheet */
		/**
		 * 1. get row count= actualCount-1
		 */
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row count is : " + rowCount);

		/**
		 * 2. add new row
		 */
		sheet.createRow(rowCount+1);
		/**
		 * 3. delete row
		 */
		Row row = sheet.getRow(rowCount);
		sheet.removeRow(row);

		/* Create an instance of FileOutputStream */
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\testData\\AppData.xlsx");
		/* write/store the content into required file */
		workbook.write(fos);
		/**/
		fos.flush();
		fos.close();

		System.out.println("Updated Row count is : " + sheet.getLastRowNum());
	}

	@Test(enabled = true)
	public void performOperationOnCell() throws IOException {

		/* Identify the path and name of excel file */
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\testData\\AppData.xlsx");
		/* Create an instance of required workbook class */
		Workbook workbook = new XSSFWorkbook(fis);
		/* get the sheet on which operation needs to be performed */
		Sheet sheet = workbook.getSheet("Sheet1");

		/* get row */
		Row row = sheet.getRow(1);
		/* perform required operation on Row1 cell */
		int cellCount = row.getLastCellNum();
		System.out.println("cell count : " + cellCount);
		
		/*read cell contents*/
		for (int i = 0; i < cellCount; i++) {

			try {
				/* switch to check cell type and read the content accordingly */
				switch (row.getCell(i).getCellType()) {

				case Cell.CELL_TYPE_STRING:
					System.out.println("Cell contents are :" + row.getCell(i).getStringCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println("Cell contents are :" + row.getCell(i).getNumericCellValue());
					break;
				case Cell.CELL_TYPE_BOOLEAN:
					System.out.println("Cell contents are :" + row.getCell(i).getBooleanCellValue());
					break;
				case Cell.CELL_TYPE_BLANK:

					break;
				default:
					System.out.println("No matching cell found");
					break;
				}
			} catch (NullPointerException e) {
				System.out.println("Cell contents are :");
			}

		}
		
//		/*Create new cell and set its value*/
//		Cell cell=row.createCell(cellCount);
//		cell.setCellValue("pass");
		
		Cell cell=row.createCell(cellCount);
		cell.setCellValue("Pass");
		
		/* Create an instance of FileOutputStream */
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\testData\\AppData.xlsx");
		/* write/store the content into required file */
		workbook.write(fos);
		/**/
		fos.flush();
		fos.close();

	}

	public String getCellValue(String path,String sheetName,int rowNum,int cellNum) {
		
		/* Identify the path and name of excel file */
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		/* Create an instance of required workbook class */
		Workbook workbook=null;
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Sheet sheet=workbook.getSheet(sheetName);
		
			Row row=sheet.getRow(rowNum);
			/* switch to check cell type and read the content accordingly */
			switch (row.getCell(cellNum).getCellType()) {
			case Cell.CELL_TYPE_STRING:
				return row.getCell(cellNum).getStringCellValue();
			case Cell.CELL_TYPE_NUMERIC:
				return ""+(int) row.getCell(cellNum).getNumericCellValue();
			default:
				return null;
		}		
	}
	
	public void updateCellValue(String path,String sheetName,int rowNum,int cellNum,String input) {
		/* Identify the path and name of excel file */
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		/* Create an instance of required workbook class */
		Workbook workbook=null;
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Sheet sheet=workbook.getSheet(sheetName);
		
			Row row=sheet.getRow(rowNum);
			
			row.createCell(cellNum).setCellValue(input);
			FileOutputStream fos=null;
			try {
				fos = new FileOutputStream(path);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				workbook.write(fos);
				fos.flush();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	@Test
	public void getFirstCellValueFromEachRow() throws IOException{
		
	}
	
	@Test
	public void getCompleteDataFromScepecificSheet(){
		
	}
	
	@Test
	public void getRowsCountFromSheet(){
		
	}
	
	@Test
	public void getCellValueFromParticularRow(){
		
	}
	
	@Test 
	public void getSheetName(){
		
	}
	
	@Test 
	public void createAndInsertValueInCell(){
		
	}
}








